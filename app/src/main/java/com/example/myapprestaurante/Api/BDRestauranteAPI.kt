package com.example.myapprestaurante.Api

import com.example.myapprestaurante.Entidades.Usuario
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface BDRestauranteAPI {

    @GET("GetUsuarios")
    suspend fun GetUsuarios(): Response<List<Usuario>>

    @GET("GetUsuarioId/{id}")
    suspend fun GetUsuarioId(@Path("id") id:Int): Response<List<Usuario>>

    @POST("PostGrabarUsuario")
    suspend fun PostGrabarUsuario(@Body obj:Usuario): Response<Usuario>

    @PUT("PutActualizarUsuario/{id}")
    suspend fun PutActualizarUsuario(@Body obj:Usuario): Response<Usuario>

    @DELETE("DeleteEliminarUsuario/{id}")
    suspend fun DeleteEliminarUsuario(@Path("id") id:Int): Response<List<Usuario>>

    @POST("login")
    suspend fun PostvalidarUsuario(@Body obj:Usuario): Response<Usuario>

}