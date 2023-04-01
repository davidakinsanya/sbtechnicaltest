package com.example.sbtechnicaltest.view.components.data

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.sbtechnicaltest.model.JsonPlaceholderData

@Composable
fun JsonCard (json: JsonPlaceholderData) {
  Card(
    modifier = Modifier
      .fillMaxWidth(1.0f)
      .padding(15.dp)
      .height(60.dp),
    elevation = 10.dp,
  ) {
    Row(
      modifier = Modifier.padding(10.dp)
    ) {
      Column(
        Modifier.padding(top = 10.dp),
        verticalArrangement = Arrangement.Center
        , horizontalAlignment = Alignment.CenterHorizontally) {
        // Put Image here
        Text("000" , Modifier.size(36.dp), color = Color.Blue)
      }
      Spacer(Modifier.padding(start = 0.dp))

      Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        // Put text here
        Text(text = "View log", Modifier.size(40.dp), color = Color.Blue)
      }
    }
  }
}