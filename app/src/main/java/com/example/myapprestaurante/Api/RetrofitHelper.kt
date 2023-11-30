package com.example.myapprestaurante.Api

import com.example.myapprestaurante.Utiles.Constantes

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    companion object{

        var retrofit = Retrofit.Builder()
            .baseUrl(Constantes.Ruta)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}