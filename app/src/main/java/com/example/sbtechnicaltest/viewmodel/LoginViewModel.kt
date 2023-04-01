package com.example.sbtechnicaltest.viewmodel

import androidx.navigation.NavController
import com.example.sbtechnicaltest.R

class LoginViewModel(private val email: String,
                     private val password: String,
                     private val navController: NavController) {

  private val emailExtensions: List<String> =
    listOf("@gmail.com", "@gmail.co.uk",
           "@yahoo.com", "@yahoo.co.uk",
            "@hotmail.com", "@hotmail.co.uk")

  private val uniqueCharacter: List<Char> = listOf('%', '?', '!', '#', '~', '-')

  fun navigateToData() {
    navController.navigate(R.id.dataFragment)
  }

 fun verifyUser(): Boolean {
    return checkCredentials()
  }

  private fun checkCredentials(): Boolean {
    return checkEmail() && checkPassword()
  }

  private fun checkEmail(): Boolean {
    for (ext in this.emailExtensions) {
      if (email.contains(ext))
      // check for a proper email extension in the email
        return true
    }
    return false
  }

  private fun checkPassword(): Boolean {
    for (char in this.uniqueCharacter) {
      if (password.matches(Regex(".*[A-Z].*")) && password.contains(char))
        // check for uppercase and unique character
        if (password.matches(Regex("\\d")))
          // check for a digit in the password
          return true
    }
    return false

  }

}