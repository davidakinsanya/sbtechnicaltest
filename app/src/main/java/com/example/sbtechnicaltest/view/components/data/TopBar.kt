package com.example.sbtechnicaltest.view.components.data

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun TopBar() {
  Text(
    modifier = Modifier.fillMaxWidth(0.85f),
    text = "Photos",
    fontSize = 30.sp,
    textAlign = TextAlign.Center,
    fontWeight = FontWeight.Bold
  )
}