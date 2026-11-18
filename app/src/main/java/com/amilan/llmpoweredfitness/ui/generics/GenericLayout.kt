package com.amilan.llmpoweredfitness.ui.generics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun GenericLayout(
  title: String,
  selectedTab: Int,
  onTabSelected: (Int) -> Unit,
  content: @Composable () -> Unit
) {
  Scaffold(
    topBar = {
      Header(title)
    },
    bottomBar = {
      Footer(
        selected = selectedTab,
        onTabSelected = onTabSelected
      )
    }
  ) { innerPadding ->
    Box(
      modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize(),
      contentAlignment = Alignment.Center
    ) {
      content()
    }
  }
}

