package com.example.weatherapp.ui.home

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.weatherapp.ui.image.Swipeable_Images
import com.example.weatherapp.ui.text.CenterWeathertext
import com.example.weatherapp.ui.text.TopWeathertext


@Composable
fun OverlayComposable() {
    val gradientColorsList = listOf(
        listOf(Color(0xFF00008B), Color(0xFF87CEEB)),
        listOf(Color(0xFF8B0000), Color(0xFFFF4500))
    )

    var targetGradientColors by remember { mutableStateOf(gradientColorsList[0]) }

    val animatedStartColor by animateColorAsState(targetGradientColors[0])
    val animatedEndColor by animateColorAsState(targetGradientColors[1])

    Box(modifier = Modifier.fillMaxSize()) {
        BackGround(animatedStartColor, animatedEndColor)
        Column {
            TopWeathertext()
            Swipeable_Images { index ->
                targetGradientColors = gradientColorsList.getOrNull(index)
                    ?: gradientColorsList[0]
            }
            CenterWeathertext()
        }
    }
}