package com.example.heroesdbapp.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hero")
data class Hero
    (
    @PrimaryKey(autoGenerate = true)  val id: Int,
    val name : String,
    val image : String
){
    companion object{
        val heroes = listOf<Hero>(
            Hero(1, "Capitán América", "https://img.asmedia.epimg.net/resizer/v2/QODR7WPXE5MZFHULFKKLZ6IIXY.jpg?auth=98235374a21d659603f2f62319535d92f6b99c280f959c6e9b4dbf90df7ac197&width=1200&height=1200&smart=true"),
            Hero(2, "Iron Man", "https://playcontestofchampions.com/wp-content/uploads/2021/11/champion-iron-man-infinity-war-720x720.jpg"),
            Hero(3, "Thor", "https://i.guim.co.uk/img/media/d4646ec3a06383f12e311d758dc7dce9f0290cca/2306_230_3742_2245/master/3742.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=cc2753765db7f0f93fda02e9550dce1d"),
            Hero(4,  "Black Panther", "https://media.newyorker.com/photos/5a87650156b75c08a3e5bbb6/1:1/w_2400,h_2400,c_limit/Cobb-Black-Panther.jpg"),
            Hero(5,  "Hawk eye", "https://www.outerlimittoys.com/cdn/shop/products/2063c5af7f494b818b37208dbd8c8b09xl.webp?v=1669230643"),
        )
    }
}