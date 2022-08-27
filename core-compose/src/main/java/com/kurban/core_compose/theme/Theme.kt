package com.kurban.core_compose.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun BankAppTheme(
//    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
//    val colors = if (darkTheme) {
//        DarkColorsPalette
//    } else {
//        LightColorsPalette
//    }

    MaterialTheme(
        colors = LightColorsPalette,
        shapes = shapes,
        content = content
    )
}