package com.example.sbtechnicaltest.view.components.login

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
  fun InputField(input: MutableState<String>, label: String) {
    TextField(
      modifier = Modifier.fillMaxWidth(0.9f),
      value = input.value,
      onValueChange = { input.value = it },
      label = { Text(label) },
    )
  Spacer(Modifier.padding(5.dp))
  }