package com.amilan.llmpoweredfitness.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.amilan.llmpoweredfitness.TABS
import com.amilan.llmpoweredfitness.ui.generics.GenericLayout
import com.amilan.llmpoweredfitness.ui.workout.ExercisesScreen
import com.amilan.llmpoweredfitness.ui.workout.PlansScreen

@Composable
fun MainScreen(data: IntArray) {
  var selectedTab by rememberSaveable {
    mutableIntStateOf(0)
  }

  GenericLayout(
    title = TABS[selectedTab],
    selectedTab = selectedTab,
    onTabSelected = { selectedTab = it }
  ) {
    when (selectedTab) {
      0 -> PlansScreen(weeks=data)
      1 -> ExercisesScreen(exercises = data)
      //2 -> SettingsScreen()
    }
  }
}
