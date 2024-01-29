package com.example.decomposeapp.presentation.coin_detail.components

import com.example.decomposeapp.presentation.coin_detail.coin_detail_state.CoinDetailState
import kotlinx.coroutines.flow.StateFlow

interface CoinDetailComponent {

    val coinDetailState: StateFlow<CoinDetailState>

    fun onBackClick()
}