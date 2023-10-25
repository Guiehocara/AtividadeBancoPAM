package com.example.aplicativo

import android.content.Context
import androidx.room.Room
import com.example.aplicativo.room.TesteDao
import com.example.aplicativo.room.TesteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TesteObjeto {

    @Singleton
    @Provides
    fun providesTesteDao(teste: TesteDatabase): TesteDao{
    return teste.testeDao()
    }


    @Singleton
    @Provides
    fun providesTesteDatabase(@ApplicationContext context: Context): TesteDatabase{
        return Room.databaseBuilder(
            context,
            TesteDatabase::class.java, "teste_db"
        ).fallbackToDestructiveMigration().build()
    }
}