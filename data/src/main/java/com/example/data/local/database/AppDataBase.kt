package com.example.data.local.database

import androidx.room.Database
import com.example.data.local.database.daos.CharacterDao
import com.example.data.local.database.entity.CharacterDBO

@Database(entities = [CharacterDBO::class], version = 1)
 abstract class AppDataBase {

  abstract val characterDao:CharacterDao
}
