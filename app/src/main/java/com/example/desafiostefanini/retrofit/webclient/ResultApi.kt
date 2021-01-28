package com.example.desafiostefanini.retrofit.webclient

class ResultApi<Success> {

    private constructor(value: Success) {
        this.value = value
    }

    private constructor(error: String) {
        this.error = error
    }

    var value: Success? = null
    var error: String? = null

    fun isSuccess() = value != null
    fun isError() = error != null

    companion object {
        fun <Success> createSuccess(value: Success) =
            ResultApi(value)
        fun <Error> createError(error: String) =
            ResultApi<Error>(error)
    }
}