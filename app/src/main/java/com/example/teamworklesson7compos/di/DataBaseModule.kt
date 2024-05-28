package com.example.teamworklesson7compos.di

import android.content.Context
import androidx.room.Room
import com.example.data.local.database.RickAndMortyDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideRickAndMortyDataBase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, RickAndMortyDataBase::class.java, RICK_AND_MORTY_DATABASE
    ).fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun provideCharacterDao(rickAndMortyDataBase: RickAndMortyDataBase) =
        rickAndMortyDataBase.characterDao()

    private const val RICK_AND_MORTY_DATABASE = "rickandmorty"
}