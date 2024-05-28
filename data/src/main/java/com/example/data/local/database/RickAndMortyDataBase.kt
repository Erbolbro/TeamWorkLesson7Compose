package com.example.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.local.database.daos.CharacterDao
import com.example.data.local.database.entity.CharacterDBO

@Database(entities = [CharacterDBO::class], version = 2, exportSchema = false)
 abstract class RickAndMortyDataBase :RoomDatabase(){
  abstract fun characterDao():CharacterDao
}