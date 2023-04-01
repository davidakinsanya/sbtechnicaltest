package com.example.sbtechnicaltest.view.components.login

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sbtechnicaltest.R
import com.example.sbtechnicaltest.viewmodel.LoginViewModel

@Composable
fun LoginButton(viewModel: LoginViewModel, navController: NavController) {
  Button(modifier =
    Modifier
      .fillMaxWidth(0.9f)
      .padding(top = 90.dp),
    onClick  = {
      if (viewModel.verifyUser())
        navController.navigate(R.id.action_loginFragment_to_dataFragment)

    }) {
    Text(text = "LOG IN", Modifier.align(Alignment.CenterVertically))
  }
}