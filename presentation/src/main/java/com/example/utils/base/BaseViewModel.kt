package com.example.teamworklesson7compose.utils.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.teamworklesson7compose.utils.Either
import com.example.teamworklesson7compose.utils.UIState
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    protected open fun <T> kotlinx.coroutines.flow.Flow<Either<Throwable, T>>.collectFlowAsState(
        state: MutableLiveData<UIState<T>>,
    ) {
        viewModelScope.launch {
            this@collectFlowAsState.collect {
                when (it) {
                    is Either.Left -> {
                        it.left?.let { t ->
                            val message = t.message ?: "Unknown error!"
                            state.value = UIState.Error(t, message)
                        }
                    }

                    is Either.Right -> {
                        it.right?.let { data ->
                            state.value = UIState.Success(data)
                        }
                    }
                }
            }
        }
    }
}