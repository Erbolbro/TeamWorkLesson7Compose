package com.example.domain.usecases

import com.example.domain.Either
import com.example.domain.epository.RickAndMortyRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase  @Inject constructor(private val repository: RickAndMortyRepository) {
    suspend  fun execute() : Flow<Either<Throwable, List<Character>>> = repository.getCharacters()
}