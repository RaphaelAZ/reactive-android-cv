package com.wordline.cv.models

data class PersonalData (
    val name: String,
    val firstname: String,
    val job: String,
    val email: String,
    val skills: List<Skill>,
    val experiences: List<Experience>
)

data class Skill(val name: String, val mark: Int)

data class Experience(val name: String, val content: String)