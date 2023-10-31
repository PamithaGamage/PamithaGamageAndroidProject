package com.example.loginpage

import com.google.gson.annotations.SerializedName

data class LoginRequest (
    @field:SerializedName("username") private val username: String,
    @field:SerializedName("password") private val password: String

    )