package com.example.heroesdbapp.presentation.states

import com.example.heroesdbapp.domain.models.Hero

data class HeroState (
    val heroes: List<Hero> = emptyList(),
    //val shoppingCartProducts: List<Hero> = emptyList()
)