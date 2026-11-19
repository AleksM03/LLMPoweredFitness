package com.amilan.llmpoweredfitness.ui.workout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amilan.llmpoweredfitness.ui.generics.AddButton
import com.amilan.llmpoweredfitness.ui.workout.components.PlanCardContent
import com.amilan.llmpoweredfitness.ui.workout.components.WorkoutCard

private const val CARD_MAX_WIDTH_SCALE = 0.85f

private const val CARDS_DP_DISTANCE = 13


@Composable
fun PlansScreen(
  weeks: IntArray,
  modifier: Modifier = Modifier
) {
  Column(
    modifier = modifier
      .padding(top = CARDS_DP_DISTANCE.dp)
      .fillMaxWidth()
      .fillMaxHeight(),
    verticalArrangement = Arrangement.spacedBy(CARDS_DP_DISTANCE.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    for (week in weeks) {
      WorkoutCard(
        content = {PlanCardContent(text = "Week $week", isCompleted = false)},
        onButtonClick = {},
        Modifier.fillMaxWidth(CARD_MAX_WIDTH_SCALE)
      )
    }
    AddButton(
      onClick = {},
      modifier = Modifier.fillMaxWidth()
    )
  }
}
