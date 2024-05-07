package com.example.heroesdbapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.heroesdbapp.data.dao.HeroDao
import com.example.heroesdbapp.domain.models.Hero

@Database(entities = [Hero::class], version = 1)
abstract class HeroDb : RoomDatabase() {
    abstract fun heroDao() : HeroDao
}
