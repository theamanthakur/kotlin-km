package com.learning.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform