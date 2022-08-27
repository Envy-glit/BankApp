package com.kurban.core_compose.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val blue = Color(0x77c3fd)
val darkerBlue = Color(0x000d3d)

internal val LightColorsPalette = lightColors(
    primary = blue,
    primaryVariant = Color.White,
    secondary = Color.White,
)

internal val DarkColorsPalette = darkColors(
    primary = blue,
    primaryVariant = Color.White,
    secondary = Color.White,
    background = darkerBlue,
)
