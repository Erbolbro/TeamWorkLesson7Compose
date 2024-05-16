package com.example.data.remote.apiservice

import com.example.android4_5.data.remote.models.character.CharacterResponse
import retrofit2.http.GET

private const val CHARACTER_END_POINT = "character"

interface RickAndMortyApi {

@GET(CHARACTER_END_POINT)
suspend fun getCharacter():CharacterResponse
}