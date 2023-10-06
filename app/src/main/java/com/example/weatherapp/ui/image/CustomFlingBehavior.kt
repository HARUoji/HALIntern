package com.example.weatherapp.ui.image
//
//import androidx.compose.foundation.gestures.FlingBehavior
//import androidx.compose.foundation.gestures.ScrollScope
//import androidx.compose.foundation.lazy.LazyListState
//
//class CustomFlingBehavior(private val state: LazyListState, toFloat: Float) : FlingBehavior {
//    override suspend fun ScrollScope.performFling(initialVelocity: Float): Float {
//        when {
//            initialVelocity > 0 -> {  // 右方向へのスクロール
//                val targetItemIndex = state.layoutInfo.totalItemsCount - 1  // 最後のアイテムへスクロール
//                state.animateScrollToItem(targetItemIndex)
//            }
//            initialVelocity < 0 -> {  // 左方向へのスクロール
//                state.animateScrollToItem(0)  // 最初のアイテムへスクロール
//            }
//        }
//        return initialVelocity
//    }
//}
