package com.example.sbtechnicaltest.view.components.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavController
import com.example.sbtechnicaltest.viewmodel.LoginViewModel

/**
 * A composable function representing all the components of the login screen.
 *
 * @param email the mutable state of the users email
 * @param password the mutable state of the users password
 * @param navController a Navigation Controller to navigate to the next screen
 *                      if the business rules are met regarding logging in
 */
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