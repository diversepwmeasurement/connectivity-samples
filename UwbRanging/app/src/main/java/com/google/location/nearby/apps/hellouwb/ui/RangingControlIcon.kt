package com.google.location.nearby.apps.hellouwb.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Start
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RangingControlIcon(
  modifier: Modifier = Modifier,
  selected: Boolean,
) {
  val icon = if (selected) Icons.Filled.Stop else Icons.Filled.Start
  val iconColor = if (selected) Color.Red else MaterialTheme.colorScheme.scrim
  val borderColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f)
  val backgroundColor =
    if (selected) {
      MaterialTheme.colorScheme.error
    } else {
      MaterialTheme.colorScheme.onPrimary
    }
  Surface(
    color = backgroundColor,
    shape = CircleShape,
    border = BorderStroke(2.dp, borderColor),
    modifier = modifier.size(36.dp, 36.dp)
  ) {
    Image(
      imageVector = icon,
      colorFilter = ColorFilter.tint(iconColor),
      modifier = Modifier.padding(8.dp),
      contentDescription = null // toggleable at higher level
    )
  }
}

@Preview("Off")
@Composable
fun RangingControlButtonOff() {
  RangingControlIcon(selected = false)
}

@Preview("On")
@Composable
fun RangingControlButtonOn() {
  RangingControlIcon(selected = true)
}
