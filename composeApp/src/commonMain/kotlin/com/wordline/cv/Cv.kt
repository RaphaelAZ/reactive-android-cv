package com.wordline.cv

import ExperiencesListView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Cv() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEAEAEA))
    ) {
        val personalDatas = mockData();

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
                Text(text = "${personalDatas.name} ${personalDatas.firstname}", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Text(text = personalDatas.job, fontSize = 18.sp, color = Color.Gray)
            }
        }

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Passionné par le développement web et l'expérience utilisateur.",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Compétences", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            SkillsListView(personalDatas.skills);

            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Expériences", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            ExperiencesListView(personalDatas.experiences);
        }

//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(start = 16.dp, bottom = 48.dp, end = 16.dp),
//            verticalArrangement = Arrangement.Bottom,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Card {
//                Button(
//                    modifier = Modifier
//                        .padding(10.dp)
//                        .fillMaxWidth(),
//                    onClick = { downloadCV() }
//                ) {
//                    Text(
//                        text = "Télécharger le CV",
//                        fontSize = 20.sp
//                    )
//                }
//            }
//        }
    }
}

fun mockData(): PersonalData {
    return PersonalData(
        name = "Azevedo",
        firstname = "Raphaël",
        job = "Développeur d'Applications",
        email = "azevedo.raphael2017@gmail.com",
        skills = listOf(
            Skill("Angular", 4),
            Skill("VueJS", 2),
            Skill("Java", 1),
            Skill("HTML/CSS", 4),
            Skill("JavaScript/Typescript", 3),
            Skill("PHP", 3),
            Skill("SQL", 3),
            Skill("Symfony", 3),
        ),
        experiences = listOf(
            Experience("CGI Finance", "Concepteur d'applications Angular"),
            Experience("Ax2Lan", "Concepteur Web, et d'applications mobiles"),
            Experience("DRSM", "Stagiaire technicien réseau et développeur web")
        )
    )
}