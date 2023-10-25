package com.example.aplicativo.room

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface TesteDao {
    @Query("select * from Teste")
    fun getTeste(): Flow<List<TesteDao>>
}