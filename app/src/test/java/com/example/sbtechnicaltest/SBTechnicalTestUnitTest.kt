package com.example.sbtechnicaltest

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

  /**
   * This method tests whether the getData() method in DataViewModel
   * returns the appropriate data type.
   */
  @Test
  fun basicDataViewModelTest() {
    val data = DataViewModel()
    assertNotNull(data.getData())
  }

  /**
   * This method test whether an appropriate email and password
   * is verified successfully by the LoginViewModel.
   */
  @Test
  fun basicLoginViewModelTest1() {
    val email = "ayestar123@gmail.com"
    val password = "Password1%"

    val login = LoginViewModel(email, password)
    assertTrue(login.verifyUser())
  }

  /**
   * This method test whether an inappropriate email and password
   * is successfully not verified by the LoginViewModel.
   */
  @Test
  fun basicLoginViewModelTest2() {
    val email = "studentbeans67@yahoo.com"
    val password = "Pass1~"

    val login = LoginViewModel(email, password)
    assertFalse(login.verifyUser())
  }

  /**
   * This method test whether another case where
   * an inappropriate email and password
   * is successfully not verified by the LoginViewModel.
   */
  @Test
  fun basicLoginViewModelTest3() {
    val email = "studentbeans67@yahoo.co"
    val password = "Password1%"

    val login = LoginViewModel(email, password)
    assertFalse(login.verifyUser())
  }
}