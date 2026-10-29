package com.example.auto_pipeliner

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform