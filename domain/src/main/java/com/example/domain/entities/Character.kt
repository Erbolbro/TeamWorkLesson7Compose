package com.example.domain.entities


data class Character(
    val image: String,
    val gender:String,
    val species: String = "",
    val created: String = "",
    val origin: Origin,
    val name: String = "",
    val location: Location,
    val episode: List<String>?,
    val id: Int = 0,
    val type: String = "",
    val url: String = "",
    val status: String = ""
)
