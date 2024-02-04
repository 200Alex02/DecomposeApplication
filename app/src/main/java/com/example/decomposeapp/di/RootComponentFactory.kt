package com.example.decomposeapp.di

import com.arkivanov.decompose.ComponentContext
import com.example.decomposeapp.presentation.coin_screens.coin_screens_component.RealCoinScreensComponent
import com.example.decomposeapp.presentation.root_bottom.root_bottom_component.RealRootBottomComponent
import com.example.decomposeapp.presentation.root_bottom.root_bottom_component.RootBottomComponent
import javax.inject.Inject

class RootComponentFactory @Inject constructor(
    private val coinScreensComponentFactory: CoinScreensComponentFactory
) {

    fun create(
        config: RealRootBottomComponent.ConfigBottom,
        componentContext: ComponentContext,
    ) = when (config) {
        is RealRootBottomComponent.ConfigBottom.Coin -> RootBottomComponent.ChildBottom.CoinChild(
            RealCoinScreensComponent(
                componentContext = componentContext,
                coinScreensComponentFactory = coinScreensComponentFactory
            )
        )

        is RealRootBottomComponent.ConfigBottom.Settings -> RootBottomComponent.ChildBottom.SettingsChild
    }
}