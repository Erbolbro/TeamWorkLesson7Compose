package com.example.presentation.ui.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.domain.Either
import com.example.domain.usecases.GetCharactersUseCase
import com.example.utils.UIState
import com.example.utils.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(private val getCharactersUseCase: GetCharactersUseCase) :
    BaseViewModel() {

    private val _characterState = MutableLiveData<UIState<List<Character>>>()
    val characterState: LiveData<UIState<List<Character>>> = _characterState


    init {
        viewModelScope.launch {
            getCharacters()
        }
    }
    private fun getCharacters() {
        _characterState.value = UIState.Loading
        viewModelScope.launch {
            try {
                val result = getCharactersUseCase.execute()
                result.collect { gottenResult ->
                    when (gottenResult) {
                        is Either.Right -> {
                            _characterState.value = UIState.Success(gottenResult.right)
                        }

                        is Either.Left -> {
                            _characterState.value =
                                UIState.Error(gottenResult.left ?: Exception("Error"))
                        }
                    }
                }
            } catch (e: Exception) {
                _characterState.value = UIState.Error(e)
            }
        }
    }

}