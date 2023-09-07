package com.bis.Expence.data.network

import com.google.gson.Gson
import com.google.gson.internal.GsonBuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtility {
    val baseUrl="https://script.google.com/macros/s/AKfycbypTrRaHnLBejUVLvvuU-epjMvp9VrqauqXkXFqx8pIQ_FAoLEXhGQGv1ngzHpL_Jwp/"

    fun getInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(OkHttpClient.Builder().also { client ->
                //if (BuildConfig.DEBUG) {
                    val logging = HttpLoggingInterceptor()
                    logging.setLevel(HttpLoggingInterceptor.Level.BODY)
                    client.addInterceptor(logging)

               // }
            }.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}