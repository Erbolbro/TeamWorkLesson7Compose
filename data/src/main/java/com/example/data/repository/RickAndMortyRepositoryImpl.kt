package com.example.data.repository

import com.example.common.utils.base.BaseRepository
import com.example.data.local.database.daos.CharacterDao
import com.example.data.local.database.entity.CharacterMapperEntity
import com.example.data.remote.apiservice.RickAndMortyApi
import com.example.data.remote.model.character.toDomain
import com.example.domain.Either
import com.example.domain.entities.Character
import com.example.domain.repository.RickAndMortyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(
    private val apiService: RickAndMortyApi,
    private val characterDao: CharacterDao
) : RickAndMortyRepository, BaseRepository() {
    override suspend fun getCharacters(): Flow<Either<Throwable, List<Character>>> =
        doRequest {
            apiService.getCharacter().results!!.map {
                it.toDomain()
            }
        }

    override suspend fun insertCharacters(character: List<Character>) {
        withContext(Dispatchers.IO) {
            characterDao.insertCharacters(character.map {
                CharacterMapperEntity.from(it)
            })
        }
    }

    override fun fetchLocalCharacters() = flow<Either<String, List<Character>>> {
        emit(Either.Right(characterDao.fetchLocalCharacters().map {
            CharacterMapperEntity.toModel(it)
        }))
    }.flowOn(Dispatchers.IO).catch {
        emit(Either.Left(it.localizedMessage ?: "Error"))
    }

}