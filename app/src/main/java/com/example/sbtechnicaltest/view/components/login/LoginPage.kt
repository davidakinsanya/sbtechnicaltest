package com.example.sbtechnicaltest.view.components.login

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.sbtechnicaltest.view.components.InputField
import com.example.sbtechnicaltest.view.components.LoginPrompt

@Composable
fun LoginPage(email: String, password: String, navController: NavController) {
  LoginPrompt()
  InputField(email, "Email")
  InputField(password, "Password")
  LoginButton()
}