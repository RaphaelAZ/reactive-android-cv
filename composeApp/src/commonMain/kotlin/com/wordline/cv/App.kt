package com.wordline.cv

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wordline.cv.models.DarkColorPalette
import com.wordline.cv.models.LightColorPalette
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var isDarkMode by remember { mutableStateOf(false) }
    val backgroundColor = if (isDarkMode) Color(0xFFEAEAEA) else Color(0xFF121212)
    val textColor = if (isDarkMode) Color.Black else Color.White
    val colors = if (isDarkMode) DarkColorPalette else LightColorPalette

    MaterialTheme(colors = colors) {
        Column(modifier = Modifier.fillMaxSize().background(backgroundColor)) {
            Cv()
            // Home()

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text("Dark Mode", style = TextStyle(fontSize = 18.sp), color = textColor)
                Switch(checked = isDarkMode, onCheckedChange = {
                    isDarkMode = it
                })
            }
        }
    }
}