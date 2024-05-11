package com.example.teamworklesson7compose.domain.usecases

import com.example.android4_5.data.remote.models.character.ResultsItemCharacters
import com.example.teamworklesson7compose.data.models.character.CharacterResponse
import com.example.teamworklesson7compose.domain.repository.RickAndMortyRepository
import com.example.teamworklesson7compose.utils.Either
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(private val repository: RickAndMortyRepository) {
    suspend operator fun invoke() : Flow<Either<Throwable, List<ResultsItemCharacters>>> = repository.getCharacters()
}