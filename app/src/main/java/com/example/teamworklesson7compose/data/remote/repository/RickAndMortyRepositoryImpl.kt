package com.example.teamworklesson7compose.data.remote.repository

import com.example.teamworklesson7compose.data.models.character.toDomain
import com.example.teamworklesson7compose.data.remote.apiservices.RickAndMortyApi
import com.example.teamworklesson7compose.domain.entities.Character
import com.example.teamworklesson7compose.domain.repository.RickAndMortyRepository
import com.example.teamworklesson7compose.utils.Either
import com.example.teamworklesson7compose.utils.base.BaseRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(private val apiService: RickAndMortyApi) :
    RickAndMortyRepository, BaseRepository() {
    override suspend fun getCharacters(): Flow<Either<Throwable, List<Character>>> =
        doRequest {
            apiService.getCharacters().results.map { it.toDomain() }
        }
}