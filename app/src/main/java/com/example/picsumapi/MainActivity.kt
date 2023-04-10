package com.example.picsumapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.picsumapi.adapter.AdapterImage
import com.example.picsumapi.databinding.ActivityMainBinding
import com.example.picsumapi.model.ResponseGetRandomImagesItem
import com.example.picsumapi.server.ApiClient
import com.example.picsumapi.server.ApiServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    //binding =>
    private lateinit var binding: ActivityMainBinding

    //Adapter =>
    private val imageAdapter: AdapterImage by lazy {
        AdapterImage()
    }

    //ApiServices =>
    private val api: ApiServices by lazy {
        ApiClient().getClient().create(ApiServices::class.java)
    }

    //Call image api =>
    private val callImageApi by lazy {
        api.getRandomImages(3, 100)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //InitViews =>
        binding.apply {
            progressbarMain.visibility = View.VISIBLE
            txtEmptyState.visibility = View.GONE
            callImageApi.enqueue(object :Callback<MutableList<ResponseGetRandomImagesItem>>{
                override fun onResponse(call: Call<MutableList<ResponseGetRandomImagesItem>>, response: Response<MutableList<ResponseGetRandomImagesItem>>) {
                    if (response.isSuccessful) {
                        progressbarMain.visibility = View.GONE
                        txtEmptyState.visibility = View.GONE
                        recyclerMain.visibility = View.VISIBLE
                        response.body()?.let {itBody->
                            if (itBody.isNotEmpty()) {
                                imageAdapter.differ.submitList(itBody)
                                //RecyclerView =>
                                recyclerMain.apply {
                                    adapter = imageAdapter
                                    layoutManager = LinearLayoutManager(this@MainActivity , RecyclerView.VERTICAL , false)
                                }
                            }
                        }
                    }
                }

                override fun onFailure(call: Call<MutableList<ResponseGetRandomImagesItem>>, t: Throwable) {
                    progressbarMain.visibility = View.GONE
                    txtEmptyState.visibility = View.VISIBLE
                    Log.e("onFailure" , "ERR : ${t.message}")
                }

            })
        }

    }
}
