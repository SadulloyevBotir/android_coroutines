package com.example.android_coroutines.repository

import com.example.android_coroutines.retrofit.ApiService

class UserRepository (private var apiService: ApiService){

    suspend fun getUsersFromJsonPlaceHolder() = apiService.getUsersFromJsonPlaceHolder()

    suspend fun getUsersFromGithub() = apiService.getUsersFromGithub()
}