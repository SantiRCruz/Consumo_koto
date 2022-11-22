package com.example.consumokotlinsimple.interfaces

import com.example.consumokotlinsimple.models.ResponseResult
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users?page=2 ")
    fun getUsers(): Call<ResponseResult>
}