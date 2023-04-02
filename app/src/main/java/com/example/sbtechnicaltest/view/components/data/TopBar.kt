package com.example.sbtechnicaltest.view.components.data

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.sbtechnicaltest.R

/**
 * A composable function representing the top half
 * of the data screen.
 */
@Composable
fun TopBar(navController: NavController) {
  Row(modifier = Modifier.padding(start = 80.dp)) {
    BackButton(navController)
    Text(
      modifier = Modifier.padding(start = 50.dp),
      text = "Photos",
      fontSize = 30.sp,
      fontWeight = FontWeight.Bold
    )
  }
}

/**
 * A composable function representing a back button.
 */
@Composable
fun BackButton(navController: NavController) {
  Button(onClick = { navController.navigate(R.id.action_dataFragment_to_loginFragment) }) {

    AsyncImage(
      model = "https://img.icons8.com/material-outlined/512/u-turn-to-right.png",
      contentDescription = null,
      modifier = Modifier.fillMaxHeight(0.05f).fillMaxWidth(0.05f)
    )
  }
}