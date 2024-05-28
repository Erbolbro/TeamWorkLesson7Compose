package com.example.data.local.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.common.utils.mapper.Mappable
import com.example.domain.entities.Character

@Entity(tableName = "character")
data class CharacterDBO(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val name: String,
    val image: String
)