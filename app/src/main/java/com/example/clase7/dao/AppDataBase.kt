package com.example.clase7.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.clase7.entities.City


@Database(entities = [City::class], version=1)
abstract class AppDataBase:RoomDatabase() {
    abstract fun CityDao():CityDao
}