package com.example.picsumapi.model


import com.google.gson.annotations.SerializedName

class ResponseGetRandomImages : ArrayList<ResponseGetRandomImages.ResponseGetRandomImagesItem>(){
    data class ResponseGetRandomImagesItem(
        @SerializedName("author")
        val author: String?, // Ben Moore
        @SerializedName("download_url")
        val downloadUrl: String?, // https://picsum.photos/id/102/4320/3240
        @SerializedName("height")
        val height: Int?, // 3240
        @SerializedName("id")
        val id: String?, // 102
        @SerializedName("url")
        val url: String?, // https://unsplash.com/photos/pJILiyPdrXI
        @SerializedName("width")
        val width: Int? // 4320
    )
}