package com.example.heroesdbapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.heroesdbapp.HeroesDBApp
import com.example.heroesdbapp.data.dao.HeroDao
import com.example.heroesdbapp.data.repositories.HeroRepositoryImpl
import com.example.heroesdbapp.domain.models.Hero
import com.example.heroesdbapp.domain.repositories.HeroRepository
import com.example.heroesdbapp.domain.use_cases.GetHeroes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideString() : String {
        return "Hola desde dagger Hilt"
    }

    @Volatile
    private var INSTANCE : HeroesDBApp? = null

    @Provides
    @Singleton
    fun provideBarcodeDb(
        @ApplicationContext context: Context
    ):HeroesDBApp {
        return INSTANCE  ?: synchronized(this){
            val instance = INSTANCE
            if(instance != null){
                instance
            }
            else {
                val callback = object : RoomDatabase.Callback(){
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        CoroutineScope(Dispatchers.IO).launch{
                            val db = INSTANCE ?: return@launch
                            val heroDao = db.heroDao()
                            populateDatabase(heroDao)
                        }
                    }

                    suspend fun populateDatabase(heroDao: HeroDao){
                        val heroes = Hero.heroes
                        heroDao.insertAll(heroes)
                    }
                }
                Room.databaseBuilder(
                    context.applicationContext,
                    HeroesDBApp::class.java, "heroes_db"
                )
                    .addCallback(callback)
                    .build().also {
                        INSTANCE = it
                    }
            }
        }
//        val callback = object : RoomDatabase.Callback(){
//            override fun onCreate(db: SupportSQLiteDatabase) {
//                super.onCreate(db)
//                val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
//                applicationScope.launch {
//                    val barcodeDb = provideBarcodeDb(context)
//                    val productDao = barcodeDb.productDao()
//                    populateDatabase(productDao)
//                }
//            }
//
//            suspend fun populateDatabase(productDao: ProductDao){
//                val products = Product.products
//                productDao.insertAll(products)
//            }
//        }
//
//
//        return Room.databaseBuilder(
//            context,
//            BarcodeDb::class.java,
//            "barcode_db"
//        ).addCallback(callback).build()
    }

    @Provides
    @Singleton
    fun provideHeroRepository(db:HeroesDBApp) : HeroRepository{
        return HeroRepositoryImpl(db.heroDao())
    }

    @Provides
    @Singleton
    fun provideGetProducts(heroRepository: HeroRepository) : GetHeroes{
        return GetHeroes(heroRepository)
    }
}