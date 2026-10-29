package com.example.auto_pipeliner

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import androidx.compose.ui.unit.DpSize

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Auto Pipeliner",
        state = rememberWindowState(size = DpSize(1000.dp, 700.dp))
    ) {
        App()
    }
}