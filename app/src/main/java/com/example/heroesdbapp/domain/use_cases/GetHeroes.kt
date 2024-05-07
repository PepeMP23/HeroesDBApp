package com.example.heroesdbapp.domain.use_cases

import com.example.heroesdbapp.domain.models.Hero
import com.example.heroesdbapp.domain.repositories.HeroRepository
import kotlinx.coroutines.flow.Flow

class GetHeroes (private val repository: HeroRepository
) {
    suspend operator fun invoke() : Flow<List<Hero>> {
        return repository.getAllHeroes()
    }
}