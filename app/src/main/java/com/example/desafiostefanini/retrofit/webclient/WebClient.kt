package com.example.desafiostefanini.retrofit.webclient

import retrofit2.Response

fun <T> doRequest(response: Response<T>): ResultApi<T> {
    return if (response.isSuccessful) {
        ResultApi.createSuccess(
                response.body()!!
        )
    } else {
        ResultApi.createError(response.message())
    }
}