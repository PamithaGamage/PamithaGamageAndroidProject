package com.example.loginpage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsViewModel : ViewModel() {
    private val _data = MutableLiveData<List<String>>(emptyList())
    val data: LiveData<List<String>> get() = _data

    fun setData(newData: List<String>) {
        _data.value = newData
    }
}