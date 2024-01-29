package com.example.decomposeapp.presentation.coin_detail.coin_detail_state

import com.example.decomposeapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
