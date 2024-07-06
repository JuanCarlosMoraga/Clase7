package com.example.clase7.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Index
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.clase7.entities.City

@Dao()
abstract class CityDao {

    @Insert
    abstract suspend fun insert(city: City)

    @Query("select * from cities")
    abstract suspend fun getAllCity():List<City>

    @Update
    abstract suspend fun update(city: City)

    @Delete
    abstract suspend fun delete(city: City)
}