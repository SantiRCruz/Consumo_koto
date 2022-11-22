package com.example.consumokotlinsimple.interfaces

import com.example.consumokotlinsimple.models.ResponseResult
import com.example.consumokotlinsimple.models.postUser.RespuestaPostUsuario
import com.example.consumokotlinsimple.models.postUser.EnviarUsuario
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("users?page=2 ")
    fun getUsers(): Call<ResponseResult>

    @POST("users")
    fun postUsuario(@Body enviarUsuario: EnviarUsuario):Call<RespuestaPostUsuario>
}