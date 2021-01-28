@file:JvmName("Providers")
package com.example.desafiostefanini.provider

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.desafiostefanini.retrofit.AppRetrofit
import com.example.desafiostefanini.retrofit.service.ServiceApi
import com.example.desafiostefanini.repository.MainRepository
import com.example.desafiostefanini.usecase.MainUseCase
import com.example.desafiostefanini.ui.viewmodel.MainViewModel

fun providerMainViewModel(activity: AppCompatActivity): MainViewModel =
    ViewModelProviders.of(activity).get(MainViewModel::class.java)

fun providerApi(): ServiceApi =
    AppRetrofit.service

fun providerMainUseCase(): MainUseCase =
    MainUseCase(MainRepository())
