package com.example.teamworklesson7compose.domain.entities

import com.example.android4_5.data.remote.models.character.Location
import com.example.android4_5.data.remote.models.character.Origin

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
