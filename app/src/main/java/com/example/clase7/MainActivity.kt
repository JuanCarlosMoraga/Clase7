package com.example.clase7

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.clase7.dao.DataBaseBuilder
import com.example.clase7.databinding.ActivityMainBinding
import com.example.clase7.entities.City
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    lateinit var   binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        funMain()

    }

    private fun funMain() = runBlocking{
        val context = this@MainActivity
        val db = DataBaseBuilder.getInstance(context)

        val city = City(0,"Masaya","Ciudad de las flores", 50000)
        val city1 = City(0,"Managua","Capital de Nicaragua", 500600)
        val city2 = City(0,"Granada","La gran Sultana", 200600)

        var listCities : List<City> = listOf(city, city1, city2)

        val cityDao = db.CityDao()

        listCities.forEach{
            city -> cityDao.insert(city)
        }

    }
}