package com.example.sbtechnicaltest.view.components.login

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sbtechnicaltest.viewmodel.LoginViewModel

@Composable
fun LoginButton(viewModel: LoginViewModel) {
  Button(modifier =
    Modifier
      .fillMaxWidth(0.9f)
      .padding(top = 90.dp),
    onClick  = {
      if (viewModel.verifyUser())
        viewModel.navigateToData()
    }) {
    Text(text = "LOG IN", Modifier.align(Alignment.CenterVertically))
  }
}