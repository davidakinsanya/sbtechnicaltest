package com.example.sbtechnicaltest

import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import com.example.sbtechnicaltest.viewmodel.DataViewModel
import com.example.sbtechnicaltest.viewmodel.LoginViewModel
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class SBTechnicalTestUnitTest {

  @Test
  fun basicViewModelTest() {
    val data = DataViewModel()
    assertNotNull(data.getData())
  }

  @Test
  fun basicLoginViewModelTest1() {
    val email = "ayestar123@gmail.com"
    val password = "Password1%"

    val login = LoginViewModel(email, password, null)
    assertTrue(login.verifyUser())
  }

  @Test
  fun basicLoginViewModelTest2() {
    val email = "studentbeans67@yahoo.com"
    val password = "Pass1~"

    val login = LoginViewModel(email, password, null)
    assertFalse(login.verifyUser())
  }

  @Test
  fun basicLoginViewModelTest3() {
    val email = "studentbeans67@yahoo.co"
    val password = "Password1%"

    val login = LoginViewModel(email, password, null)
    assertFalse(login.verifyUser())
  }
}