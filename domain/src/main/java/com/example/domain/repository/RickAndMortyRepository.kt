package com.example.domain.repository

import com.example.domain.Either
import com.example.domain.entities.Character
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface RickAndMortyRepository {
    suspend fun getCharacters(): Flow<Either<Throwable, List<Character>>>
    suspend fun insertCharacters(character: List<Character>)
    fun fetchLocalCharacters(): Flow<Either<String,List<Character>>>

}