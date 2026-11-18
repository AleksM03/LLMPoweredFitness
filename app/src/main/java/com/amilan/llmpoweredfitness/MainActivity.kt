package com.amilan.llmpoweredfitness

import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amilan.llmpoweredfitness.ui.generics.GenericLayout
import com.amilan.llmpoweredfitness.ui.theme.AppTheme
import com.amilan.llmpoweredfitness.ui.workout.PlansScreen

val TABS: List<String> = listOf("Plans", "Exercises", "Settings")

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
      window.isNavigationBarContrastEnforced = false
    }
    setContent {
      AppTheme {
        GenericLayout(
          title = TABS[0],
          content = { PlansScreen(intArrayOf(1, 2, 3), modifier = Modifier) },
          onTabSelected = {},
          selectedTab = 0
        )
      }
    }
  }
}

@Preview(
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_YES,
  widthDp = 360,
  heightDp = 640
)
@Composable
fun ExamplePreview() {
  val exampleData = intArrayOf(1, 2, 3)
  AppTheme {
    GenericLayout(
      title = TABS[0],
      content = { PlansScreen(exampleData, modifier = Modifier) },
      onTabSelected = {},
      selectedTab = 0
    )
  }
}
