package com.example.data.remote.model.character

import com.example.data.remote.model.character.Info
import com.example.data.remote.model.character.ResultsItemCharacters
import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("results")
    val results: List<ResultsItemCharacters>?,
    @SerializedName("info")
    val info: Info
)