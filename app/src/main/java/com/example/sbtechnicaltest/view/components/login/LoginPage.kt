package com.example.sbtechnicaltest.view.components.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavController
import com.example.sbtechnicaltest.viewmodel.LoginViewModel

@Composable
fun LoginPage(email: MutableState<String>,
              password: MutableState<String>,
              navController: NavController) {

  val loginViewModel = LoginViewModel(email.value, password.value);

  LoginPrompt()
  InputField(email, "Email")
  InputField(password, "Password")
  LoginButton(loginViewModel, navController)
}