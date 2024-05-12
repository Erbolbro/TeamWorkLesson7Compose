package com.example.teamworklesson7compose.data.models.character

import com.example.android4_5.data.remote.models.character.Info
import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("results")
    val results: List<ResultsItemCharacters>,
    @SerializedName("info")
    val info: Info
)