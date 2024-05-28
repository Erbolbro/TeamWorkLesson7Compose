package com.example.data.local.database.entity

import com.example.common.utils.mapper.Mapper
import com.example.domain.entities.Character

object CharacterMapperEntity: Mapper<CharacterDBO, Character> {
    override fun toModel(model: CharacterDBO)= Character(
        id = model.id,
        name = model.name,
        image = model.image
    )

    override fun from(model: Character)= CharacterDBO(
        id = model.id,
        name = model.name,
        image = model.image
    )

}