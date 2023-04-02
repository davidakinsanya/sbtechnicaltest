package com.example.sbtechnicaltest.viewmodel

/**
 * This class represents the business logic regarding
 * whether a user can log in the app or not.
 *
 * @author david
 */
class LoginViewModel(private val email: String,
                     private val password: String) {

  private val emailExtensions: List<String> =
    listOf(
      "@gmail.com", "@gmail.co.uk",
      "@yahoo.com", "@yahoo.co.uk",
      "@hotmail.com", "@hotmail.co.uk", ".ac.uk"
    )

  private val uniqueCharacter: List<Char> = listOf('%', '?', '!', '#', '~', '-')

  /**
   * This method executes and returns the output of checkCredentials().
   *
   * return the output of checkCredentials()
   */
  fun verifyUser(): Boolean {
    return checkCredentials()
  }

  /**
   * This method checks whether both the email and password are valid.
   *
   * @return a Boolean representing whether both the email and password are valid
   */
  private fun checkCredentials(): Boolean {
    return checkEmail() && checkPassword()
  }

  /**
   * This method checks if email meets a specific criteria.
   *
   * @return a boolean representing whether or not the email is valid
   */
  private fun checkEmail(): Boolean {
    for (ext in this.emailExtensions) {
      if (email.contains(ext))
      // check for a proper email extension in the email
        return true
    }
    return false
  }

  /**
   * This method checks if the password meets a specified criteria.
   *
   * @return a boolean representing whether or not the password is valid
   */
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

  /**
   * A basic toString() method for debugging.
   *
   * @return a String representation of the email and password
   */
  fun getCredentials(): String {
    return "Email: $email Password: $password"
  }
}