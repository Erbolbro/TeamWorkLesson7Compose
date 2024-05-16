package com.example.data.repository

import com.example.data.remote.apiservice.RickAndMortyApi
import com.example.domain.Either
import com.example.domain.epository.RickAndMortyRepository
import kotlinx.coroutines.flow.Flow

class RickAndMortyRepositoryImpl @Inject constructor(private val apiService: RickAndMortyApi) :
    RickAndMortyRepository, BaseRepository() {
    override suspend fun getCharacters(): Flow<Either<Throwable, List<Character>>> =
        doRequest {
            apiService.getCharacters().results.map { it.toDomain() }
        }
}