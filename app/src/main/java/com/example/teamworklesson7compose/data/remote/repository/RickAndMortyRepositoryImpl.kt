package com.example.teamworklesson7compose.data.remote.repository

import com.example.android4_5.data.remote.models.character.ResultsItemCharacters
import com.example.teamworklesson7compose.data.remote.apiservices.RickAndMortyApi
import com.example.teamworklesson7compose.domain.repository.RickAndMortyRepository
import com.example.teamworklesson7compose.utils.Either
import com.example.teamworklesson7compose.utils.base.BaseRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(private val apiService: RickAndMortyApi)
    : RickAndMortyRepository, BaseRepository() {
    override suspend fun getCharacters(): Flow<Either<Throwable, List<ResultsItemCharacters>>>  =
        doRequest {
            apiService.getCharacters().results
        }


}