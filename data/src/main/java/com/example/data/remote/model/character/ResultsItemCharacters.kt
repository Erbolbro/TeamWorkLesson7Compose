package com.example.data.remote.model.character

import com.example.domain.entities.Character
import com.google.gson.annotations.SerializedName

data class ResultsItemCharacters(
    @SerializedName("image")
    val image: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("id")
    val id: Int = 0,
)

fun ResultsItemCharacters.toDomain() =
    Character(
        image,
        name,
        id
    )