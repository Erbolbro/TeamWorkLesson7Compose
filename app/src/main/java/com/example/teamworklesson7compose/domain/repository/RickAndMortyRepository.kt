package com.example.teamworklesson7compose.domain.repository

import com.example.android4_5.data.remote.models.character.ResultsItemCharacters
import com.example.teamworklesson7compose.utils.Either
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {
     suspend fun getCharacters() : Flow<Either<Throwable, List<ResultsItemCharacters>>>
}