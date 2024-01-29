package com.example.decomposeapp.presentation.coin_screens.coin_screen_ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState
import com.example.decomposeapp.presentation.coin.ui.CoinListUi
import com.example.decomposeapp.presentation.coin_detail.ui.CoinDetailUi
import com.example.decomposeapp.presentation.coin_screens.coin_screens_component.CoinScreensComponent

@Composable
fun CoinScreensUi(component: CoinScreensComponent) {
    val childStack by component.childStack.subscribeAsState()

    Children(
        stack = childStack,
        animation = stackAnimation(slide())
    ) {child ->
        when (val instance = child.instance) {
            is CoinScreensComponent.Child.List -> CoinListUi(instance.component)
            is CoinScreensComponent.Child.Details -> CoinDetailUi(instance.component)
        }
    }
}