package com.example.domain.repository

import com.example.domain.Either
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {
    suspend fun getCharacters() : Flow<Either<Throwable, List<Character>>>
}