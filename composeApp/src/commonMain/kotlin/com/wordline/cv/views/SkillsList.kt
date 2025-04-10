package com.wordline.cv.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wordline.cv.models.Skill

@Composable
fun SkillsListView(skills: List<Skill>, isDarkMode: Boolean) {
    val textColor = if (isDarkMode) Color.Black else Color.White

    Column(modifier = Modifier.padding(top = 8.dp)) {
        skills.forEach { skill ->
            Row {
                Text(
                    text = "• ${skill.name} - ${skill.mark}/5",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(vertical = 2.dp),
                    color = textColor
                )
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Accueil",
                    tint = Color(0xFF9EFD38),
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}