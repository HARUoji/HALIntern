package com.example.weatherapp.ui.text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R


@Composable
fun CenterWeatherText() {
    val offset = Offset(0.0f, 0.8f)
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            stringResource(id = R.string.current_temperature),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            maxLines = 1,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            style = TextStyle(
                fontSize = 60.sp,
                color = Color.White,
                shadow = Shadow(
                    color = Color.DarkGray,
                    offset = offset,
                    blurRadius = 5f
                )
            )
        )
    }
}

@Preview()
@Composable
fun CenterWeatherTextPreview() {
    val offset = Offset(0.0f, 0.8f)
    Box(modifier = Modifier
        .fillMaxWidth(),
        contentAlignment = Alignment.Center) {
        Text(
            stringResource(id = R.string.current_temperature),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            maxLines = 1,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            style = TextStyle(
                fontSize = 60.sp,
                color = Color.White,
                shadow = Shadow(
                    color = Color.DarkGray,
                    offset = offset,
                    blurRadius = 5f
                )
            )
        )
    }
}

