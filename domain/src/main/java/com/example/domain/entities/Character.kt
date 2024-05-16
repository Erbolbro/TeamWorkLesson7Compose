package com.example.domain.entities


data class Character(
    val image: String,
    val gender:String,
    val species: String = "",
    val created: String = "",
    val origin: com.example.android4_5.data.remote.models.character.Origin,
    val name: String = "",
    val location: com.example.data.remote.model.character.Location,
    val episode: List<String>?,
    val id: Int = 0,
    val type: String = "",
    val url: String = "",
    val status: String = ""
)
