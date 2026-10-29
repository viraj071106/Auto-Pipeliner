package com.example.auto_pipeliner

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Autopipeliner",
    ) {
        App()
    }
}