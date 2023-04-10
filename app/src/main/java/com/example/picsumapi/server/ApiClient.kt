package com.example.picsumapi.server

import android.provider.SyncStateContract
import com.example.picsumapi.utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private lateinit var retrofit: Retrofit

class ApiClient {


    private val client = OkHttpClient.Builder()
        .connectTimeout(Constants.NETWORK_TIME, TimeUnit.SECONDS)
        .writeTimeout(Constants.NETWORK_TIME, TimeUnit.SECONDS)
        .readTimeout(Constants.NETWORK_TIME, TimeUnit.SECONDS)
        .build()

    fun getClient(): Retrofit {
        retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit
    }

}