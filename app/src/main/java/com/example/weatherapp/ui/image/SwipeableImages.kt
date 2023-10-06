package com.example.weatherapp.ui.image

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.ui.home.BackGround

//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun Swipeable_Images(onImageChanged: (Int) -> Unit) {
//    val imageList = ImageLoader()
//    val lazyListState = rememberLazyListState()
//
//    // 画像の平均の幅を計算する
//    val averageItemSize = imageList.map { it.width.toFloat() }.average()
//
//    LazyRow(
//        state = lazyListState,
//        horizontalArrangement = Arrangement.spacedBy(16.dp),
//        contentPadding = PaddingValues(horizontal = 16.dp),
//        flingBehavior = CustomFlingBehavior(lazyListState, averageItemSize.toFloat())
//    ) {
//        items(imageList) { imageData ->
//            Image(
//                painter = painterResource(id = imageData.resId),
//                contentDescription = "",
//                modifier = Modifier
//                    .padding(imageData.padding.dp)
//                    .offset(8.dp, 0.dp)
//                    .size(imageData.width.dp, imageData.height.dp)
//            )
//        }
//    }
//}


@Composable
fun Swipeable_Images(onImageChanged: (Int) -> Unit) {
    val imageList = ImageLoader()

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(imageList) { imageData ->
            Image(
                painter = painterResource(id = imageData.resId),
                contentDescription = "",
                modifier = Modifier
                    .padding(imageData.padding.dp)
                    .offset(8.dp, 0.dp)
                    .size(imageData.width.dp, imageData.height.dp)
                    .clickable { onImageChanged(imageList.indexOf(imageData)) }
            )
        }
    }
}
