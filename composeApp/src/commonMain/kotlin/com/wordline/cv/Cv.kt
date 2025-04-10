package com.wordline.cv

import ExperiencesListView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wordline.cv.models.Experience
import com.wordline.cv.models.PersonalData
import com.wordline.cv.models.Skill
import com.wordline.cv.views.SkillsListView
import cv.composeapp.generated.resources.Res
import cv.composeapp.generated.resources.alien
import org.jetbrains.compose.resources.painterResource

@Composable
fun Cv() {
    val isDarkMode = MaterialTheme.colors.isLight.not()
    val textColor = if (isDarkMode) Color.Black else Color.White

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        val personalDatas = mockData()

        Row(modifier = Modifier.padding(top = 30.dp)) {
            Image(
                painter = painterResource(Res.drawable.alien),
                contentDescription = "Photo de profil",
                modifier = Modifier
                    .size(140.dp)
                    .padding(16.dp)
                    .clip(CircleShape)
            )
            Column(modifier = Modifier.padding(16.dp).weight(1f).height(100.dp), verticalArrangement = Arrangement.Center,) {
                Text(text = "${personalDatas.name} ${personalDatas.firstname}", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = textColor)
                Text(text = personalDatas.job, fontSize = 18.sp, color = Color.Gray)
            }
        }

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = personalDatas.about,
                fontSize = 16.sp,
                color = textColor
            )

            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Compétences", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = textColor)
            SkillsListView(personalDatas.skills, isDarkMode)

            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Expériences", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = textColor)
            ExperiencesListView(personalDatas.experiences, isDarkMode)
        }

        // TODO: Bouton téléchargement du CV
    }
}


fun mockData(): PersonalData {
    return PersonalData(
        name = "Azevedo",
        firstname = "Raphaël",
        about = "Passionné par le développement web et l'expérience utilisateur.",
        job = "Développeur d'Applications",
        email = "azevedo.raphael2017@gmail.com",
        skills = listOf(
            Skill("Angular", 4),
            Skill("VueJS", 3),
            Skill("Java", 2),
            Skill("HTML/CSS", 4),
            Skill("JavaScript/Typescript", 4),
            Skill("PHP", 3),
            Skill("SQL", 4),
            Skill("Symfony", 4),
        ),
        experiences = listOf(
            Experience("CGI Finance", "Concepteur d'applications Angular"),
            Experience("Ax2Lan", "Concepteur Web, et d'applications mobiles"),
            Experience("DRSM", "Stagiaire technicien réseau et développeur web")
        )
    )
}