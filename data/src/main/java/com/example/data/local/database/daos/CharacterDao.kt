package com.example.data.local.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.local.database.entity.CharacterDBO

@Dao
interface CharacterDao {
    @Query("SELECT * FROM character")
    suspend fun fetchLocalCharacters(): List<CharacterDBO>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertCharacters(characters: List<CharacterDBO>)

}