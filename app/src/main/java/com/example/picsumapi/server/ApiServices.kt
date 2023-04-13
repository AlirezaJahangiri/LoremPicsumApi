package com.example.picsumapi.server

import com.example.picsumapi.model.ResponseRandomPhotos
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("photos/random/")
    fun getRandomImages(
        @Query("client_id") client_id: String,
        @Query("count") count: Int,
        @Query("orientation") orientation: String
    ): Call<ResponseRandomPhotos>

}