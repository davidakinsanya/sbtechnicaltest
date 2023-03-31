package com.example.sbtechnicaltest.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sbtechnicaltest.model.JsonPlaceholderData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.URL

class DataViewModel: ViewModel() {

  fun getData(): List<JsonPlaceholderData>? {
    val jsonList = object : TypeToken<List<JsonPlaceholderData>>() {}.type
    val response = URL("https://jsonplaceholder.typicode.com/photos/")
    val gson = Gson()
    return gson.fromJson(response.readText(), jsonList)
  }
}