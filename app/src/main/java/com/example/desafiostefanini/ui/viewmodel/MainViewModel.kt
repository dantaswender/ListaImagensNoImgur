package com.example.desafiostefanini.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.desafiostefanini.helper.NETWORK_ERROR
import com.example.desafiostefanini.model.DataResponse
import com.example.desafiostefanini.provider.providerMainUseCase
import com.example.desafiostefanini.retrofit.webclient.ResultApi
import com.example.desafiostefanini.ui.viewmodel.base.BaseViewModel
import com.example.desafiostefanini.ui.viewmodel.state.MainState
import kotlinx.coroutines.launch

class MainViewModel : BaseViewModel() {

    private val useCase by lazy {
        providerMainUseCase()
    }

    private val state: MutableLiveData<MainState> = MutableLiveData()
    val viewState: LiveData<MainState> = state

    fun getImages() {
        state.value = MainState.ShowLoading
        launch {
            try {
                val response = (useCase.getImages())
                onResponse(response)
            } catch (e: Exception) {
                state.value = MainState.HideLoading
                state.value = MainState.IsError(NETWORK_ERROR)
            }
        }
    }

    private fun onResponse(response: ResultApi<DataResponse>) {
        when {
            response.isSuccess() -> {
                response.value?.let {
                    state.value = MainState.GetImages(it)
                }
            }
            response.isError() -> {
                state.value = MainState.IsError(NETWORK_ERROR)
            }
        }
        state.value = MainState.HideLoading
    }
}
