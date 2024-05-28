package com.example.common.utils.mapper

interface Mappable

interface Mapper<F : Any, T : Any> {

    fun toModel(model: F): T
    fun from(model: T): F
}