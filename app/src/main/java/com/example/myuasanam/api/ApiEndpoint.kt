package com.example.myuasanam.api

import com.example.myuasanam.Model.Model
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {
    @GET("data.php")
    fun data() : Call<Model>
}