package com.example.desafiostefanini.ui.viewmodel.state

import com.example.desafiostefanini.model.DataResponse

sealed class MainState {
    data class GetImages(val response: DataResponse): MainState()
    data class IsError(val error: String): MainState()
    object ShowLoading: MainState()
    object HideLoading: MainState()
}