package com.example.loginpage

import com.google.gson.annotations.SerializedName

data class HelloResponse (
    @SerializedName("message")
    val message: String? = null
)