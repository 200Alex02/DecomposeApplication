package com.example.decomposeapp.presentation.coin_screens.coin_screens_component

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.example.decomposeapp.factory.CoinScreensComponentFactory
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

class RealCoinScreensComponent @Inject constructor(
    componentContext: ComponentContext,
    coinScreensComponentFactory: CoinScreensComponentFactory
) : ComponentContext by componentContext, CoinScreensComponent {

    private val navigation = StackNavigation<ChildConfig>()

    override val childStack: Value<ChildStack<ChildConfig, CoinScreensComponent.Child>> = childStack(
        source = navigation,
        initialConfiguration = ChildConfig.List,
        handleBackButton = true,
        childFactory = { childConfig, componentContext ->
            coinScreensComponentFactory.create(childConfig = childConfig, componentContext, navigation)
        }
    )

    sealed interface ChildConfig : Parcelable {

        @Parcelize
        data object List : ChildConfig

        @Parcelize
        data class Details(val coinId: String) : ChildConfig
    }
}