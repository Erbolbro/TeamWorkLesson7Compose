package com.example.common.utils.base

import com.example.common.Either
import jdk.jfr.internal.OldObjectSample.emit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseRepository {
    protected fun <T : Any> doRequest(
        request: suspend () -> T,
    ): Flow<com.example.domain.Either<Throwable, List<Character>>> = flow<Either<Throwable, T>> {
        emit(
            Either.Right(request())
        )
    }.flowOn(Dispatchers.IO).catch {
        emit(Either.Left(it))
    }
}