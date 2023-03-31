package com.example.sbtechnicaltest

import com.example.sbtechnicaltest.viewmodel.DataViewModel
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
}