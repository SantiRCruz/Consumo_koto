package com.example.consumokotlinsimple

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.consumokotlinsimple.databinding.ActivityMainBinding
import com.example.consumokotlinsimple.interfaces.ApiService
import com.example.consumokotlinsimple.models.ResponseResult
import com.example.consumokotlinsimple.models.species.Species
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private val speciesList =
        mutableListOf<Species>(Species(1, "pollo"), Species(2, ""), Species(3, "cerdo"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        obtenerData()
        clicks()


    }

    private fun clicks() {
    }

    private fun obtenerData() {
        val retro = Retrofit.Builder()
            .baseUrl("https://reqres.in/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: ApiService = retro.create(ApiService::class.java)
        service.getUsers().enqueue(object : Callback<ResponseResult>{
            override fun onResponse(
                call: Call<ResponseResult>,
                response: Response<ResponseResult>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<ResponseResult>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}

