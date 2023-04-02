package com.example.sbtechnicaltest.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.navigation.fragment.findNavController
import com.example.sbtechnicaltest.view.components.login.LoginPage

/**
 * This class contains the fragment displaying the UI regarding the login screen.
 *
 * @author david
 */
class LoginFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val navController = findNavController()

    return ComposeView(requireContext()).apply {
      val email = mutableStateOf("ayestar123@gmail.com") // valid email already in input field
      val password = mutableStateOf("Password123%") // valid password already in input field
      setContent {
        Column(Modifier.padding(top = 100.dp, start = 40.dp)) {
          LoginPage(email, password, navController)
        }
      }
    }
  }
}