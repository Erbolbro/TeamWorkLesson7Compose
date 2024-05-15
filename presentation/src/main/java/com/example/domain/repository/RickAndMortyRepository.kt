package com.example.teamworklesson7compose.domain.repository

import com.example.teamworklesson7compose.data.models.character.ResultsItemCharacters
import com.example.teamworklesson7compose.domain.entities.Character
import com.example.teamworklesson7compose.utils.Either
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {
     suspend fun getCharacters() : Flow<Either<Throwable, List<Character>>>
}