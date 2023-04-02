package com.example.sbtechnicaltest.view.components.data

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * A composable function representing the top half
 * of the data screen.
 */
@Composable
fun TopBar() {
  Text(
    modifier = Modifier.padding(start = 140.dp),
    text = "Photos",
    fontSize = 30.sp,
    fontWeight = FontWeight.Bold
  )
}