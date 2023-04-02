package com.example.sbtechnicaltest.view.components.data

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.sbtechnicaltest.model.JsonPlaceholderData

/**
 * A composable function used to display Json data.
 *
 * @param json a JsonPlaceholderData object
 */
@Composable
fun JsonCard (json: JsonPlaceholderData) {
  Card(
    modifier = Modifier
      .fillMaxWidth(1.0f)
      .padding(15.dp)
      .height(140.dp),
    elevation = 10.dp,
  ) {
    Row(
      modifier = Modifier.padding(10.dp)
    ) {
      Column(
        modifier = Modifier.fillMaxHeight(3.0f)) {

        AsyncImage(
          model = json.thumbnailUrl,
          contentDescription = null,
          modifier = Modifier.fillMaxHeight()
        )

      }
      Spacer(Modifier.padding(start = 50.dp))

      Column(modifier = Modifier.fillMaxHeight(1f),
        verticalArrangement = Arrangement.Center) {

        Text(text = json.title,
             modifier = Modifier
               .padding(top = 5.dp).height(70.dp).width(100.dp),
              color = Color.Black,
              maxLines = 3)
      }
    }
  }
}