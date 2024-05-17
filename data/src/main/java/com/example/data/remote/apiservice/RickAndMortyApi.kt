package com.example.data.remote.apiservice

import com.example.data.remote.model.character.CharacterResponse
import retrofit2.http.GET

private const val CHARACTER_END_POINT = "character"

interface RickAndMortyApi {

@GET(CHARACTER_END_POINT)
suspend fun getCharacter(): CharacterResponse
}