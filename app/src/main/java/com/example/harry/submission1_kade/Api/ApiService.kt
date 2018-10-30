package com.example.harry.submission1_kade.Api

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {

    fun create(): EndPoint {

        val httpClient = OkHttpClient().newBuilder()
        val interceptor = Interceptor { chain ->
            val request = chain?.request()?.newBuilder()?.addHeader("X-Auth-Token", "9594bdd135834da68c6a066a329578cf")?.build()
            chain?.proceed(request)
        }

        val client =  httpClient.addInterceptor(interceptor).build()

        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .baseUrl("https://api.football-data.org/v2/")
                .build()
        return retrofit.create(EndPoint::class.java)
    }
}