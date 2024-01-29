package com.example.decomposeapp.presentation.coin_screens_component

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.pushNew
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.example.decomposeapp.domain.use_case.GetCoinUseCaseById
import com.example.decomposeapp.domain.use_case.GetCoinsUseCase
import com.example.decomposeapp.presentation.coin.components.RealCoinListComponent
import com.example.decomposeapp.presentation.coin_detail.components.RealCoinDetailComponent
import kotlinx.parcelize.Parcelize
import javax.inject.Inject

class RealCoinScreensComponent @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase,
    private val getCoinUseCaseById: GetCoinUseCaseById,
    componentContext: ComponentContext
) : ComponentContext by componentContext, CoinScreensComponent {

    private val navigation = StackNavigation<ChildConfig>()

    override val childStack: Value<ChildStack<ChildConfig, CoinScreensComponent.Child>> = childStack(
        source = navigation,
        initialConfiguration = ChildConfig.List,
        handleBackButton = true,
        childFactory = ::createChild
    )

    private fun createChild(
        config: ChildConfig,
        componentContext: ComponentContext
    ): CoinScreensComponent.Child = when (config) {

        is ChildConfig.List -> {
            CoinScreensComponent.Child.List(
                RealCoinListComponent(
                    componentContext = componentContext,
                    onItemSelected = { coinId ->
                        navigation.pushNew(ChildConfig.Details(coinId))
                    },
                    getCoinsUseCase = getCoinsUseCase
                )
            )
        }

        is ChildConfig.Details -> {
            CoinScreensComponent.Child.Details(
                RealCoinDetailComponent(
                    componentContext = componentContext,
                    getCoinUseCaseById = getCoinUseCaseById,
                    coinId = config.coinId,
                    onBackClick = {
                        navigation.pop()
                    })
            )
        }
    }

    sealed interface ChildConfig : Parcelable {

        @Parcelize
        object List : ChildConfig

        @Parcelize
        data class Details(val coinId: String) : ChildConfig
    }

}