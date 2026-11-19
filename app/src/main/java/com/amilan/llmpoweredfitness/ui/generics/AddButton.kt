package com.amilan.llmpoweredfitness.ui.generics

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.amilan.llmpoweredfitness.R

private const val BUTTON_SCALE = 0.12f
private const val SPACING_SCALE = 0.06f

@Composable
fun AddButton(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
) {
  BoxWithConstraints(
    modifier = modifier
  ) {
    val buttonSize = maxHeight * BUTTON_SCALE
    val spacing = maxWidth * SPACING_SCALE

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = spacing),
      horizontalArrangement = Arrangement.spacedBy(spacing),
      verticalAlignment = Alignment.CenterVertically
    ) {
      HorizontalDivider(
        modifier = Modifier.weight(1f)
      )

      Box(
        modifier = Modifier
          .size(buttonSize)
          .clip(CircleShape)
          .background(MaterialTheme.colorScheme.surfaceContainer)
          .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
      ) {
        Icon(
          painter = painterResource(R.drawable.ic_add),
          contentDescription = "Add",
          tint = MaterialTheme.colorScheme.secondary
        )
      }

      HorizontalDivider(
        modifier = Modifier.weight(1f)
      )
    }
  }
}
