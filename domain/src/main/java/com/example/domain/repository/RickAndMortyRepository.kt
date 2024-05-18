package com.example.domain.repository

import com.example.domain.Either
import com.example.domain.entities.Character
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {
    suspend fun getCharacters() : Flow<Either<Throwable, List<Character>>>

}