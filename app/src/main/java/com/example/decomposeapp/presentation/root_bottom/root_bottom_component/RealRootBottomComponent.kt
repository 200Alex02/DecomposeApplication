package com.example.decomposeapp.presentation.root_bottom.root_bottom_component

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.bringToFront
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.example.decomposeapp.domain.use_case.GetCoinUseCaseById
import com.example.decomposeapp.domain.use_case.GetCoinsUseCase
import com.example.decomposeapp.presentation.coin_screens.coin_screens_component.RealCoinScreensComponent
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

class RealRootBottomComponent @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase,
    private val getCoinUseCaseById: GetCoinUseCaseById,
    componentContext: ComponentContext
) : ComponentContext by componentContext, RootBottomComponent {

    private val navigationBottomStackNavigation = StackNavigation<ConfigBottom>()

    override val childStackBottom: Value<ChildStack<*, RootBottomComponent.ChildBottom>> =
        childStack(
            source = navigationBottomStackNavigation,
            initialConfiguration = ConfigBottom.Coin,
            handleBackButton = true,
            childFactory = ::createChild
        )

    override fun openCoin() {
        navigationBottomStackNavigation.bringToFront(ConfigBottom.Coin)
    }

    override fun openSettings() {
        navigationBottomStackNavigation.bringToFront(ConfigBottom.Settings)
    }

    private fun createChild(
        config: ConfigBottom,
        componentContext: ComponentContext
    ): RootBottomComponent.ChildBottom =
        when (config) {
            is ConfigBottom.Coin -> RootBottomComponent.ChildBottom.CoinChild(
                RealCoinScreensComponent(
                    getCoinsUseCase, getCoinUseCaseById, componentContext
                )
            )

            is ConfigBottom.Settings -> RootBottomComponent.ChildBottom.SettingsChild
        }

    sealed interface ConfigBottom : Parcelable {

        @Parcelize
        object Coin : ConfigBottom

        @Parcelize
        object Settings : ConfigBottom
    }
}