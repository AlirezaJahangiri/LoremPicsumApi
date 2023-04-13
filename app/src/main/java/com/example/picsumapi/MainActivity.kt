package com.example.picsumapi

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.picsumapi.adapter.AdapterImage
import com.example.picsumapi.databinding.ActivityMainBinding
import com.example.picsumapi.model.ResponseRandomPhotos
import com.example.picsumapi.server.ApiClient
import com.example.picsumapi.server.ApiServices
import com.example.picsumapi.utils.Constants
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
        api.getRandomImages(Constants.CLIENT_ID, 30, "landscape")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //InitViews =>
        binding.apply {

            //set Visibilities =>
            recyclerMain.visibility = View.GONE
            txtEmptyState.visibility = View.GONE
            progressbarMain.visibility = View.VISIBLE

            //Api =>
            callImageApi.enqueue(object : Callback<ResponseRandomPhotos> {
                override fun onResponse(
                    call: Call<ResponseRandomPhotos>,
                    response: Response<ResponseRandomPhotos>
                ) {

                    if (response.isSuccessful) {
                        response.body()?.let { itBody ->

                            if (itBody.isNotEmpty()) {

                                //set Visibility =>
                                recyclerMain.visibility = View.VISIBLE
                                txtEmptyState.visibility = View.GONE
                                progressbarMain.visibility = View.GONE

                                imageAdapter.differ.submitList(itBody)
                                recyclerMain.apply {
                                    adapter = imageAdapter
                                    layoutManager = LinearLayoutManager(
                                        this@MainActivity,
                                        RecyclerView.VERTICAL,
                                        false
                                    )
                                }
                            }

                        }
                    }
                }

                override fun onFailure(call: Call<ResponseRandomPhotos>, t: Throwable) {
                    Log.e("onFailure", "Err: ${t.message}")

                    //set Visibility =>
                    recyclerMain.visibility = View.GONE
                    txtEmptyState.visibility = View.VISIBLE
                    progressbarMain.visibility = View.GONE
                }

            })
        }


    }
}
