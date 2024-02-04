package com.example.decomposeapp.presentation.coin.coin_state

import com.example.decompose.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
