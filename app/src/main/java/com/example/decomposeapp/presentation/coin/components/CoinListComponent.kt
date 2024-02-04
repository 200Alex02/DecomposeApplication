package com.example.decomposeapp.presentation.coin.components

import androidx.compose.runtime.MutableState
import com.example.decomposeapp.presentation.coin.coin_state.CoinListState
import kotlinx.coroutines.flow.StateFlow

interface CoinListComponent {

    val coinListState: StateFlow<CoinListState>

    val startLoadData: MutableState<Boolean>

    fun refreshData()

    fun restartData()

    fun onCoinClick(coinId: String)

}