package com.example.clase7.dao

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

object DataBaseBuilder {
    @Volatile
    private var INTANCE: AppDataBase? = null

    fun getInstance(context: Context): AppDataBase{
        return INTANCE ?: synchronized(this){
            val instance = Room.databaseBuilder(
                context.applicationContext,
                AppDataBase::class.java,
                "app_database"
            ).build()
            INTANCE = instance
            instance
        }
    }
}