package com.example.sbtechnicaltest.view.components.data

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
      RenderImage(json.url)
      Spacer(Modifier.padding(start = 50.dp))
      RenderTitle(json.title)
    }
  }
}

/**
 * A composable function used to display an image.
 *
 * @param image the image url
 */
  @Composable
  fun RenderImage(image: String) {
    Column(
      modifier = Modifier.fillMaxHeight(3.0f)
    ) {
      AsyncImage(
        model = image,
        contentDescription = null,
        modifier = Modifier.fillMaxHeight()
      )
    }
  }

  /**
   * A composable function used to display a json title.
   *
   * @param title the json title
   */
  @Composable
  fun RenderTitle(title: String) {
    Column(
      modifier = Modifier.fillMaxHeight(1f),
      verticalArrangement = Arrangement.Center
    ) {

      Text(
        text = title,
        modifier = Modifier
          .padding(top = 5.dp).height(70.dp).width(100.dp),
        color = Color.Black,
        maxLines = 3
      )
    }
  }