package com.example.teamworklesson7compose.di

import com.example.teamworklesson7compose.domain.repository.RickAndMortyRepository
import com.example.teamworklesson7compose.domain.usecases.GetCharactersUseCase
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
}