package com.example.sbtechnicaltest.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.navigation.fragment.findNavController
import com.example.sbtechnicaltest.view.components.login.LoginPage


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
      val email = mutableStateOf("")
      val password =  mutableStateOf("")

      setContent {
        Column(Modifier
          .padding(top = 100.dp, start = 40.dp)) {
          LoginPage(email, password, navController)
        }
      }
    }
  }
  }