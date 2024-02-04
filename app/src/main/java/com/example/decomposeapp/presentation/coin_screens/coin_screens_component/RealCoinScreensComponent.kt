package com.example.decomposeapp.presentation.coin_screens.coin_screens_component

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pushNew
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.example.decompose.domain.use_case.GetCoinUseCase
import com.example.decompose.domain.use_case.GetCoinUseCaseById
import com.example.decomposeapp.presentation.coin.components.RealCoinListComponent
import com.example.decomposeapp.presentation.coin_detail.components.RealCoinDetailComponent
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

class RealCoinScreensComponent @Inject constructor(
    componentContext: ComponentContext,
    private val getCoinUseCase: GetCoinUseCase,
    private val getCoinUseCaseById: GetCoinUseCaseById,
) : ComponentContext by componentContext, CoinScreensComponent {

    private val navigation = StackNavigation<ChildConfig>()

    override val childStack: Value<ChildStack<ChildConfig, CoinScreensComponent.Child>> = childStack(
        source = navigation,
        initialConfiguration = ChildConfig.List,
        handleBackButton = true,
        childFactory = ::createChild
    )

    @OptIn(ExperimentalDecomposeApi::class)
    private fun createChild(
        config: ChildConfig,
        componentContext: ComponentContext
    ): CoinScreensComponent.Child = when (config) {

        is ChildConfig.List -> {
            CoinScreensComponent.Child.List(
                RealCoinListComponent(
                    componentContext = componentContext,
                    onItemSelected =  {coinId ->
                        navigation.pushNew(ChildConfig.Details(coinId))
                    },
                    getCoinsUseCase = getCoinUseCase,
                    onBack = {}
                )
            )
        }

        is ChildConfig.Details -> {
            CoinScreensComponent.Child.Details(
                RealCoinDetailComponent(
                    componentContext = componentContext,
                    coinId = config.coinId,
                    getCoinUseCaseById = getCoinUseCaseById
                )
            )
        }
    }

    sealed interface ChildConfig : Parcelable {

        @Parcelize
        data object List : ChildConfig

        @Parcelize
        data class Details(val coinId: String) : ChildConfig
    }
}