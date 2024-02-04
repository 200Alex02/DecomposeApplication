package com.example.decomposeapp.presentation.coin_screens.coin_screens_component

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.example.decomposeapp.presentation.coin.components.CoinListComponent
import com.example.decomposeapp.presentation.coin_detail.components.CoinDetailComponent

interface CoinScreensComponent {

    val childStack: Value<ChildStack<RealCoinScreensComponent.ChildConfig, Child>>

    sealed interface Child {
        class List(val component: CoinListComponent) : Child
        class Details(val component: CoinDetailComponent) : Child
    }

    /*@AssistedFactory
    fun interface Factory {

        operator fun invoke(
            @Assisted("componentContext") componentContext: ComponentContext
        ): RealCoinScreensComponent
    }*/
}