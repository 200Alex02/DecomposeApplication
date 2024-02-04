package com.example.decomposeapp.presentation.coin.components

import com.example.decomposeapp.presentation.coin.coin_state.CoinListState
import kotlinx.coroutines.flow.StateFlow

interface CoinListComponent {

    val coinListState: StateFlow<CoinListState>

    fun refreshData()

    fun onCoinClick(coinId: String)

    fun onBack()
    /*fun interface Factory {
        operator fun invoke(
            componentContext: ComponentContext,
            onItemSelected: (id: String) -> Unit,
        ): CoinListComponent
    }*/
}