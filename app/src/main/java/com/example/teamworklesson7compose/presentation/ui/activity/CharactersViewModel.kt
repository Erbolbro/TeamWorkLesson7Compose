package com.example.teamworklesson7compose.presentation.ui.activity

import androidx.lifecycle.ViewModel
import com.example.teamworklesson7compose.domain.usecases.GetCharactersUseCase
import javax.inject.Inject

class CharactersViewModel @Inject constructor(private val getCharactersUseCase: GetCharactersUseCase)
    : ViewModel() {

        suspend fun getCharacters() = getCharactersUseCase.invoke()
}