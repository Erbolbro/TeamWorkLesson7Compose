package com.example.teamworklesson7compose.data.remote.apiservices

import com.example.teamworklesson7compose.data.models.character.CharacterResponse
import com.example.teamworklesson7compose.data.models.character.ResultsItemCharacters
import com.example.teamworklesson7compose.domain.entities.Character
import retrofit2.http.GET


private const val END_POINT ="character"
interface RickAndMortyApi {

    @GET(END_POINT)
    suspend fun getCharacters(): CharacterResponse
}