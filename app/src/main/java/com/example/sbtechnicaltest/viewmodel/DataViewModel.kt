package com.example.sbtechnicaltest.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sbtechnicaltest.model.JsonPlaceholderData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.net.URL

class DataViewModel: ViewModel() {
  private val _bootJson = MutableStateFlow(listOf<JsonPlaceholderData>())
  val bootJson: StateFlow<List<JsonPlaceholderData>> get() = _bootJson

  init {
    viewModelScope.launch(Dispatchers.Default) {
      doInBackground()
    }
  }
  private fun getData(): List<JsonPlaceholderData> {
    val jsonList = object : TypeToken<List<JsonPlaceholderData>>() {}.type
    val response = URL("https://jsonplaceholder.typicode.com/photos/")
    val gson = Gson()
    return gson.fromJson(response.readText(), jsonList)
  }

  private suspend fun doInBackground(): String = withContext(Dispatchers.IO) { // to run code in Background Thread
    val data = getData()
    _bootJson.emit(data)
    return@withContext "SomeResult"
  }
}