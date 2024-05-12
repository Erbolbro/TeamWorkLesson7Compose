package com.example.teamworklesson7compose.domain.usecases

import com.example.teamworklesson7compose.data.models.character.ResultsItemCharacters
import com.example.teamworklesson7compose.domain.entities.Character
import com.example.teamworklesson7compose.domain.repository.RickAndMortyRepository
import com.example.teamworklesson7compose.utils.Either
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(private val repository: RickAndMortyRepository) {
    suspend  fun execute() : Flow<Either<Throwable, List<Character>>> = repository.getCharacters()
}