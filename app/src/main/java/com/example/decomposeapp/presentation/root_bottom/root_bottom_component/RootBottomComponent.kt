package com.example.decomposeapp.presentation.root_bottom.root_bottom_component

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.example.decomposeapp.presentation.coin_screens.coin_screens_component.CoinScreensComponent

interface RootBottomComponent {
    val childStackBottom: Value<ChildStack<*, ChildBottom>>

    fun openCoin()
    fun openSettings()

    sealed class ChildBottom {
        class CoinChild(val component: CoinScreensComponent) : ChildBottom()
        data object SettingsChild : ChildBottom()
    }
}