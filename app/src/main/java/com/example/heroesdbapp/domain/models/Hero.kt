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
            Hero(6, "Superman", "https://cadenaser.com/resizer/Cskhq4sqlJxQ2fUX-H5_bQ2GSjs=/990x990/filters:format(jpg):quality(70)/cloudfront-eu-central-1.images.arcpublishing.com/prisaradio/OZRTFH56RRB27N5BYZX56WPERU.jpg"),
            Hero(7, "Batman", "https://coolturize.com/wp-content/uploads/batman3.png"),
            Hero(8, "Wonder Woman", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/9098ec89-c1d3-4b61-996d-33852b79c648/dge8hp2-a0c26146-8231-4023-b5fb-7fda5947960a.jpg/v1/fill/w_1920,h_1920,q_75,strp/wonder_woman__portrait__by_jfsgallery_dge8hp2-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTkyMCIsInBhdGgiOiJcL2ZcLzkwOThlYzg5LWMxZDMtNGI2MS05OTZkLTMzODUyYjc5YzY0OFwvZGdlOGhwMi1hMGMyNjE0Ni04MjMxLTQwMjMtYjVmYi03ZmRhNTk0Nzk2MGEuanBnIiwid2lkdGgiOiI8PTE5MjAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.7CchAGL_Vib4fazLk6MAQL8bjRXGrN8FZgeCL3WVUfQ"),
            Hero(9, "The Flash", "https://cdn.vox-cdn.com/thumbor/rjmkSIKvPjKycJWQSoH8PjYu0Dg=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/24684984/FLA905b_0144r.jpeg"),
            Hero(10, "Aquaman", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/a/q/aquaman-maquette-estatua-por-tweerhead-00.jpg")
        )
    }
}