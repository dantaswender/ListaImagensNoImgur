package com.example.desafiostefanini.usecase

import com.example.desafiostefanini.repository.MainRepository

class MainUseCase(private val repository: MainRepository) {

    suspend fun getImages() = repository.getImages()

}