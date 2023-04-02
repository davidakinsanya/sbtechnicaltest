package com.example.sbtechnicaltest.view.components.login

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

/**
 * A composable function representing an input field for the login page.
 *
 * @param input the mutable state of the users input
 * @param label a String represent what data the user is inputting
 */
@Composable
  fun InputField(input: MutableState<String>, label: String) {
    val bool: Boolean = label == "Password"

    TextField(
      modifier = Modifier.fillMaxWidth(0.9f),
      value = input.value,
      onValueChange = { input.value = it },
      label = { Text(label) },
      visualTransformation = if (bool) PasswordVisualTransformation() else VisualTransformation.None,
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password))

    Spacer(Modifier.padding(5.dp))
  }