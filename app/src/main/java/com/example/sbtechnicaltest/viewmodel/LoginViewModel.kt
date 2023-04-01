package com.example.sbtechnicaltest.viewmodel

class LoginViewModel(private val email: String,
                     private val password: String) {

  private val emailExtensions: List<String> =
    listOf(
      "@gmail.com", "@gmail.co.uk",
      "@yahoo.com", "@yahoo.co.uk",
      "@hotmail.com", "@hotmail.co.uk", ".ac.uk"
    )

  private val uniqueCharacter: List<Char> = listOf('%', '?', '!', '#', '~', '-')

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
      if (password.contains(char))
        return password.contains(Regex(".*[A-Z].*")) &&
                password.contains(Regex("\\d")) &&
                password.length >= 8

      // check for uppercase and unique character
      // check for a digit in the password
      // check if password is 8 characters or longer
    }
    return false
  }

  fun getCredentials(): String {
    return "Email: $email Password: $password"
  }
}