package com.wordline.cv

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cv.composeapp.generated.resources.Res
import cv.composeapp.generated.resources.alien
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Cv() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFFEAEAEA))
    ) {
        Image(
            painter = painterResource(Res.drawable.alien),
            contentDescription = "Photo de profil",
            modifier = Modifier
                .size(120.dp)
                .border(2.dp, Color.Gray, CircleShape)
                .padding(4.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Raphaël Azevedo", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = "Développeur Frontend", fontSize = 18.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Passionné par le développement web et l'expérience utilisateur.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Compétences", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        val skills = listOf("Kotlin", "Jetpack Compose", "Android SDK", "KMP", "UI/UX Design") // Remplacer par DATA CLASS

        Column(modifier = Modifier.padding(top = 8.dp)) {
            skills.forEach { skill ->
                Text(
                    text = "• $skill",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(vertical = 2.dp)
                )
            }
        }

        Card() {
            Button(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                onClick = { /* TODO: DL DU CV */ }
            ) {
                Text(
                    text = "Télécharger le CV",
                    fontSize = 20.sp
                )
            }
        }
    }
}