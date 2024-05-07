package com.example.heroesdbapp.domain.repositories

import com.example.heroesdbapp.domain.models.Hero
import kotlinx.coroutines.flow.Flow

interface HeroRepository {
    suspend fun getAllHeroes() : Flow<List<Hero>>
}