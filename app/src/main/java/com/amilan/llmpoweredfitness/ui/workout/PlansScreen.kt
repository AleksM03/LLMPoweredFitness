package com.amilan.llmpoweredfitness.ui.workout

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amilan.llmpoweredfitness.ui.theme.AppTheme
import com.amilan.llmpoweredfitness.ui.workout.components.PlanCard

private const val CARD_MAX_WIDTH_SCALE = 0.85f

private const val CARDS_DP_DISTANCE = 13


@Composable
fun PlansScreen(
  weeks: IntArray,
  modifier: Modifier
) {
  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(CARDS_DP_DISTANCE.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    for (week in weeks) {
      PlanCard(
        weekNumber = week,
        isCompleted = false,
        onButtonClick = {},
        Modifier.fillMaxWidth(CARD_MAX_WIDTH_SCALE)
      )
    }
  }
}

@Composable
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES
, widthDp = 360, heightDp = 640)
fun PlansScreenPrev() {
  val weeks: IntArray = intArrayOf(
    1,
    2,
    3
  )
  AppTheme {
    Scaffold(
      modifier = Modifier
        .fillMaxSize()
    ) { innerPadding ->
      PlansScreen(
        weeks,
        modifier = Modifier
          .padding(innerPadding)
      )
    }

  }
}
