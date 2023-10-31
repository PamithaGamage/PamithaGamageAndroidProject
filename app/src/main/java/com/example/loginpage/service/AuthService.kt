package com.example.loginpage.service

import com.example.loginpage.LoginRequest
import com.example.loginpage.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("authenticate")
    fun login(@Body loginRequest: LoginRequest?): Call<LoginResponse?>?
}
