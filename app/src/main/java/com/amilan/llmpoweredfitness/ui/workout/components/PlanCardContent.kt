package com.amilan.llmpoweredfitness.ui.workout.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.amilan.llmpoweredfitness.R

@Composable
fun PlanCardContent(text: String, isCompleted: Boolean){
  Text(
    text = text,
    modifier = Modifier,
    style = MaterialTheme.typography.bodyLarge
  )
  if (isCompleted) {
    Icon(
      painterResource(R.drawable.ic_open_card),
      contentDescription = "Open",
    )
  } else {
    Icon(
      painter = painterResource(R.drawable.ic_monitoring),
      contentDescription = "Stats",
    )
  }
}
