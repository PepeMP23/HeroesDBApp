package com.example.heroesdbapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.heroesdbapp.domain.models.Hero
import kotlinx.coroutines.flow.Flow


@Dao
interface HeroDao {
    @Query("SELECT * FROM hero")
    fun getAllHeroes() : Flow<List<Hero>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(products:List<Hero>)
}