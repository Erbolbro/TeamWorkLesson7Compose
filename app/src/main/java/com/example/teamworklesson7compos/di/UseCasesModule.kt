package com.example.teamworklesson7compos.di

import com.example.data.repository.RickAndMortyRepositoryImpl
import com.example.domain.repository.RickAndMortyRepository
import com.example.domain.usecases.GetCharactersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object UseCasesModule {

    @Provides
    @Singleton
    fun provideGetCharactersUseCase(repository: RickAndMortyRepository): GetCharactersUseCase {
        return GetCharactersUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideRickAndMortyRepository(implementation: RickAndMortyRepository): RickAndMortyRepository {
        return implementation
    }
}