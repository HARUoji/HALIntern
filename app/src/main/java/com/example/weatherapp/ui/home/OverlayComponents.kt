package com.example.weatherapp.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.weatherapp.ui.image.Swipeable_Images
import com.example.weatherapp.ui.text.TopWeather_Text


@Composable
fun OverlayComposable() {
    Box(modifier = Modifier.fillMaxSize()) {
        BackGround()
        Column {
            TopWeather_Text()
            Swipeable_Images()
        }
    }
}
