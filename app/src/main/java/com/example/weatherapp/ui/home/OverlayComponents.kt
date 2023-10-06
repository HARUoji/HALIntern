package com.example.weatherapp.ui.home

import android.view.Surface
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherapp.ui.image.SwipeableImages


@Composable
fun OverlayComposable() {
    Box(modifier = Modifier.fillMaxSize()) {
        BackGround()
        SwipeableImages()
    }
}
