package com.wordline.cv

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform