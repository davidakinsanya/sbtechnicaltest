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

/**
 * This class represents the business logic regarding getting Json data into the app.
 *
 * @author
 */
class DataViewModel: ViewModel() {
  private val _bootJson = MutableStateFlow(listOf<JsonPlaceholderData>())
  val bootJson: StateFlow<List<JsonPlaceholderData>> get() = _bootJson

  init {
    viewModelScope.launch(Dispatchers.Default) { // assists with concurrency
      doInBackground() // handles pushing app data to the UI in a background thread
    }
  }

  /**
   * This method invokes the HTTP request and condenses the return value into a Kotlin object.
   *
   * @return a JsonPlaceHolderData object
   */
  fun getData(): List<JsonPlaceholderData> {
    val jsonList = object : TypeToken<List<JsonPlaceholderData>>() {}.type
    val response = URL("https://jsonplaceholder.typicode.com/photos/")
    val gson = Gson()
    return gson.fromJson(response.readText(), jsonList)
  }

  /**
   * This function invokes a background thread to retrieve the data
   * and place the output into a MutableStateFlow.
   *
   * @return a string rendering a success statement
   */
  private suspend fun doInBackground(): String = withContext(Dispatchers.IO) { // to run code in Background Thread
    val data = getData()
    _bootJson.emit(data)
    return@withContext "SomeResult"
  }
}