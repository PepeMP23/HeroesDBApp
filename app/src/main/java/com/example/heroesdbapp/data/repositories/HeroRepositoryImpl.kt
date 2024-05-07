package com.example.heroesdbapp.data.repositories

import com.example.heroesdbapp.data.dao.HeroDao
import com.example.heroesdbapp.domain.models.Hero
import com.example.heroesdbapp.domain.repositories.HeroRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HeroRepositoryImpl @Inject constructor(
    private val heroDao: HeroDao
) : HeroRepository {
    override suspend fun getAllHeroes(): Flow<List<Hero>> {
        return heroDao.getAllHeroes()
    }

}