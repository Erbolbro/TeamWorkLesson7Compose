package com.example.data.repository

import com.example.common.utils.base.BaseRepository
import com.example.data.remote.apiservice.RickAndMortyApi
import com.example.data.remote.model.character.toDomain
import com.example.domain.Either
import com.example.domain.entities.Character
import com.example.domain.repository.RickAndMortyRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(private val apiService: RickAndMortyApi) :
    RickAndMortyRepository, BaseRepository() {
    override suspend fun getCharacters(): Flow<Either<Throwable, List<Character>>> =
        doRequest {
            apiService.getCharacter().results!!.map {
                it.toDomain()
            }
        }
}