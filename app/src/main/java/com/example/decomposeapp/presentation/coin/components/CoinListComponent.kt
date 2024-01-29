package com.example.decomposeapp.presentation.coin.components

import com.example.decomposeapp.presentation.coin.coin_state.CoinListState
import kotlinx.coroutines.flow.StateFlow

interface CoinListComponent {

    val coinListState: StateFlow<CoinListState>

    fun onCoinClick(coinId: String)
}