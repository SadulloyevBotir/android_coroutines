package com.example.android_coroutines.retrofit

import com.example.android_coroutines.models.jsonPlaceHolder.User
import com.example.android_coroutines.models.github.GithubUser
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsersFromJsonPlaceHolder(): List<User>

    @GET("users")
    suspend fun getUsersFromGithub(): List<GithubUser>
}