package com.example.aplicativo.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [com.example.aplicativo.Models.Teste::class], version = 1, exportSchema = false)
abstract class TesteDatabase: RoomDatabase() {
    abstract fun testeDao(): TesteDao
}