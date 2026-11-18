package com.amilan.llmpoweredfitness.ui.generics

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.amilan.llmpoweredfitness.R
import com.amilan.llmpoweredfitness.TABS

@Composable
fun Footer(
  selected: Int, onTabSelected: (Int) -> Unit, modifier: Modifier = Modifier
) {
  NavigationBar(modifier = modifier) {
    TABS.forEachIndexed { index, title ->
      NavigationBarItem(
        selected = selected == index,
        onClick = { onTabSelected(index) },
        icon = {
          when (index) {
            0 -> Icon(
              painter = painterResource(R.drawable.ic_exercise),
              contentDescription = ""
            )

            1 -> Icon(
              painter = painterResource(R.drawable.ic_list),
              contentDescription = ""
            )

            2 -> Icon(
              painter = painterResource(R.drawable.ic_settings),
              contentDescription = ""
            )
          }
        },
        label = {
          Text(text = title)
        })
    }
  }
}
