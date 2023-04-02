package com.example.sbtechnicaltest.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.navigation.fragment.findNavController
import com.example.sbtechnicaltest.view.components.data.JsonCard
import com.example.sbtechnicaltest.view.components.data.TopBar
import com.example.sbtechnicaltest.viewmodel.DataViewModel

/**
 * This class contains the fragment displaying the UI regarding the data screen.
 *
 * @author david
 */
class DataFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    return ComposeView(requireContext()).apply {
      setContent {
        val data = DataViewModel()
        val navController = findNavController()
        val jsonListState = data.bootJson.collectAsState()

        Column(Modifier.padding(top = 60.dp)) {
          TopBar(navController)
          Column(Modifier.padding(top = 40.dp, bottom = 80.dp)) {
            LazyColumn(
              Modifier
                .fillMaxHeight(1.0f)
                .fillMaxWidth(1.0f)
                .padding(15.dp)
                .background(
                  color = Color.Transparent,
                  shape = RoundedCornerShape(50.dp)
                ),
            )
            {
              itemsIndexed(jsonListState.value) { _, item ->
                JsonCard(item)
              }
            }
          }
        }
      }
    }
  }
}