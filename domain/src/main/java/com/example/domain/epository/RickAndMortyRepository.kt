package com.example.domain.epository

import com.example.domain.Either
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {
    suspend fun getCharacters() : Flow<Either<Throwable, List<Character>>>
}