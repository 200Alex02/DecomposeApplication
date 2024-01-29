package com.example.decomposeapp.presentation.coin

import com.example.decomposeapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
