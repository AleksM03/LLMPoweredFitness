package com.amilan.llmpoweredfitness.ui.workout.components

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.amilan.llmpoweredfitness.R

@Composable
fun ExerciseCardContent(title: String, weight: Float = 10f, type: Int = 0) {
  BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
    val contentMaxHeight = maxHeight
    Column(modifier = Modifier.fillMaxSize()) {
    Row(modifier = Modifier.fillMaxWidth()) {
      if (type == 0) {
        Icon(
          painter = painterResource(R.drawable.ic_exercise),
          contentDescription = "Weighted Exercise",
          modifier = Modifier.padding(top = contentMaxHeight * 0.1f)
        )
      } else {
        Icon(
          painter = painterResource(R.drawable.ic_cardio),
          contentDescription = "Cardio Exercise",
          modifier = Modifier.padding(top = contentMaxHeight * 0.1f)
        )
      }
      Text(
        text = title,
        modifier = Modifier.padding(top = contentMaxHeight * 0.1f),
        style = MaterialTheme.typography.bodyLarge,
      )
    }
    Row(modifier = Modifier.fillMaxWidth()) {
      if (weight > 0f) {
        Text(
          text = "Max Weight: $weight" + "KG",
          style = MaterialTheme.typography.bodyMedium,
        )
      } else {
        Text(
          text = "Test",
          style = MaterialTheme.typography.bodyMedium,
        )
      }
    }
  }
}}
