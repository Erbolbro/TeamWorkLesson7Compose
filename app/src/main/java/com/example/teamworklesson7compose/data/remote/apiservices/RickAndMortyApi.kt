package com.example.teamworklesson7compose.data.remote.apiservices

import com.example.android4_5.data.remote.models.character.CharacterResponse
import retrofit2.http.GET


private const val END_POINT ="character"
interface RickAndMortyApi {

    @GET(END_POINT)
    suspend fun getCharacters(): CharacterResponse

}