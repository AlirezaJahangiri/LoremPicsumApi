package com.example.picsumapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.picsumapi.adapter.AdapterNewPhotos
import com.example.picsumapi.databinding.ActivityNewPhotosBinding
import com.example.picsumapi.model.ResponseNewPhotos
import com.example.picsumapi.server.ApiClient
import com.example.picsumapi.server.ApiServices
import com.example.picsumapi.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewPhotosActivity : AppCompatActivity() {
    //binding =>
    private lateinit var binding: ActivityNewPhotosBinding

    //Adapter =>
    private val newPhotosAdapter: AdapterNewPhotos by lazy {
        AdapterNewPhotos()
    }

    //ApiServices =>
    private val api: ApiServices by lazy {
        ApiClient().getClient().create(ApiServices::class.java)
    }

    //Call get new photos api =>
    private val callNewPhotosApi by lazy {
        api.getNewImages(Constants.CLIENT_ID, 4, 80, "latest")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewPhotosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Init Views =>
        binding.apply {

            //Handle back btn =>
            txtNewPhotos.setOnClickListener() {
                finish()
            }

            //setVisibilities =>
            txtEmptyStateNewPhotosActivity.visibility = View.GONE
            recyclerNewPhotos.visibility = View.GONE
            progressbarNewPhotosActivity.visibility = View.VISIBLE

            //Call Api =>
            callNewPhotosApi.enqueue(object : Callback<ResponseNewPhotos> {
                override fun onResponse(
                    call: Call<ResponseNewPhotos>,
                    response: Response<ResponseNewPhotos>
                ) {

                    if (response.isSuccessful) {
                        response.body()?.let { itBody ->
                            if (itBody.isNotEmpty()) {

                                //set Visibilities =>
                                txtEmptyStateNewPhotosActivity.visibility = View.GONE
                                recyclerNewPhotos.visibility = View.VISIBLE
                                progressbarNewPhotosActivity.visibility = View.GONE

                                //Set Adapter =>
                                newPhotosAdapter.differ.submitList(itBody)
                                recyclerNewPhotos.apply {
                                    adapter = newPhotosAdapter
                                    layoutManager = LinearLayoutManager(
                                        this@NewPhotosActivity,
                                        RecyclerView.VERTICAL,
                                        false
                                    )
                                }
                            }
                        }
                    }
                }

                override fun onFailure(call: Call<ResponseNewPhotos>, t: Throwable) {
                    Log.e("onFailure", "Err: ${t.message}")

                    //setVisibilities
                    txtEmptyStateNewPhotosActivity.visibility = View.VISIBLE
                    recyclerNewPhotos.visibility = View.GONE
                    progressbarNewPhotosActivity.visibility = View.GONE
                }

            })
        }

    }
}