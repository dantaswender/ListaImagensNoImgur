package com.example.desafiostefanini.repository

import com.example.desafiostefanini.helper.AUTHORIZATION
import com.example.desafiostefanini.model.DataResponse
import com.example.desafiostefanini.provider.providerApi
import com.example.desafiostefanini.retrofit.webclient.ResultApi
import com.example.desafiostefanini.retrofit.webclient.doRequest
import retrofit2.awaitResponse

class MainRepository {

    suspend fun getImages(): ResultApi<DataResponse> =
            doRequest(providerApi().getImages(AUTHORIZATION).awaitResponse())
}