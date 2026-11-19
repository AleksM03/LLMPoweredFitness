package com.amilan.llmpoweredfitness.ui.workout.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.amilan.llmpoweredfitness.R

private const val MAX_HEIGHT_SCALE = 0.1f
private const val CONTENT_HEIGHT_SCALE = 1f
private const val CONTENT_WIDTH_SCALE = 0.8f


@Composable
fun WorkoutCard(
  content: @Composable () -> Unit,
  onButtonClick: () -> Unit,
  modifier: Modifier = Modifier
) {
  val maxHeight =
    (LocalConfiguration.current.screenHeightDp * MAX_HEIGHT_SCALE).dp
  Card(
    modifier = modifier
      .fillMaxWidth()
      .clickable(onClick = onButtonClick),
    colors = CardDefaults.cardColors(
      containerColor = MaterialTheme.colorScheme.secondaryContainer,
      contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
    )
  ) {
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .height(maxHeight),
      contentAlignment = Alignment.Center
    ) {
      Row(
        modifier = Modifier
          .fillMaxWidth(CONTENT_WIDTH_SCALE)
          .fillMaxHeight(CONTENT_HEIGHT_SCALE),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
      ) {
        content()
      }
    }
  }
}


