package com.example.decomposeapp.di

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.pushNew
import com.example.decompose.data.use_case.GetCoinUseCaseByIdImpl
import com.example.decompose.data.use_case.GetCoinsUseCaseImpl
import com.example.decomposeapp.presentation.coin.components.RealCoinListComponent
import com.example.decomposeapp.presentation.coin_detail.components.RealCoinDetailComponent
import com.example.decomposeapp.presentation.coin_screens.coin_screens_component.CoinScreensComponent
import com.example.decomposeapp.presentation.coin_screens.coin_screens_component.RealCoinScreensComponent
import javax.inject.Inject


class CoinScreensComponentFactory @Inject constructor(
    private val getCoinUseCase: GetCoinsUseCaseImpl,
    private val getCoinUseCaseById: GetCoinUseCaseByIdImpl
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


