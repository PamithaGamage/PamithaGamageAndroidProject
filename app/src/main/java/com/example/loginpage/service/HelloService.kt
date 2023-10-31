package com.example.loginpage.service

import com.example.loginpage.HelloResponse
import retrofit2.Call
import retrofit2.http.GET

interface HelloService {
    @GET("hello")
    fun hello(): Call<HelloResponse?>?
}