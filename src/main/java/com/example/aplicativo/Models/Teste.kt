package com.example.aplicativo.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Teste")

data class Teste(
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0,
    @ColumnInfo(name="title")
    val title:String = "",
    @ColumnInfo(name="")
    val teste:Long = 0
)