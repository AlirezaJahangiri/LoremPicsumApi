package com.example.picsumapi.server

import com.example.picsumapi.model.ResponseGetRandomImagesItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("list")
    fun getRandomImages (@Query("page") page :Int , @Query("limit") limit :Int) :Call<MutableList<ResponseGetRandomImagesItem>>
}