package com.example.desafiostefanini.retrofit.service

import com.example.desafiostefanini.model.DataResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ServiceApi {

    @GET("3/gallery/search/1?q=cats")
    fun getImages(
        @Header("Authorization")authorization: String
    ): Call<DataResponse>

}