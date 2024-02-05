package com.example.decomposeapp.factory

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.pushNew
import com.example.decompose.domain.use_case.GetCoinUseCase
import com.example.decompose.domain.use_case.GetCoinUseCaseById
import com.example.decomposeapp.presentation.coin.components.RealCoinListComponent
import com.example.decomposeapp.presentation.coin_detail.components.RealCoinDetailComponent
import com.example.decomposeapp.presentation.coin_screens.coin_screens_component.CoinScreensComponent
import com.example.decomposeapp.presentation.coin_screens.coin_screens_component.RealCoinScreensComponent
import javax.inject.Inject


class CoinScreensComponentFactory @Inject constructor(
    private val getCoinUseCase: GetCoinUseCase,
    private val getCoinUseCaseById: GetCoinUseCaseById
) {
    @OptIn(ExperimentalDecomposeApi::class)
    fun create(
        childConfig: RealCoinScreensComponent.ChildConfig,
        componentContext: ComponentContext,
        navigation: StackNavigation<RealCoinScreensComponent.ChildConfig>
    ) = when (childConfig) {
            is RealCoinScreensComponent.ChildConfig.List -> {
                CoinScreensComponent.Child.List(
                    RealCoinListComponent(
                        componentContext = componentContext,
                        onItemSelected = { coinId ->
                            navigation.pushNew(RealCoinScreensComponent.ChildConfig.Details(coinId))
                        },
                        getCoinsUseCase = getCoinUseCase
                    )
                )
            }

            is RealCoinScreensComponent.ChildConfig.Details -> {
                CoinScreensComponent.Child.Details(
                    RealCoinDetailComponent(
                        componentContext = componentContext,
                        coinId = childConfig.coinId,
                        getCoinUseCaseById = getCoinUseCaseById
                    )
                )
            }
        }
}


