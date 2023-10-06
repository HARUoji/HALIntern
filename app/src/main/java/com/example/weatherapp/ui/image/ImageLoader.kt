package com.example.weatherapp.ui.image

import androidx.compose.runtime.Composable
import com.example.weatherapp.R

@Composable
fun ImageLoader(): List<ImageData> {
    return listOf(
        ImageData(R.drawable.sun_icon, 240, 240,50),
        ImageData(R.drawable.moon_icon, 300, 300,35)
    )
}