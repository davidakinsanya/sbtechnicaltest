package com.example.sbtechnicaltest.view.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginPrompt() {
    Text(text = "Welcome Back",
      fontSize = 25.sp,
      fontWeight = FontWeight.Bold
    )
    Spacer(Modifier.padding(5.dp))
    Text(
      modifier = Modifier
        .padding(),
      text = "Log in to your Student Beans account",
      fontSize = 15.sp
    )
  Spacer(Modifier.padding(20.dp))
}