package com.example.decomposeapp.presentation.coin.components

import com.example.decomposeapp.common.Resource
import com.example.decomposeapp.domain.model.Coin
import kotlinx.coroutines.flow.Flow

interface CoinListComponent {

    val coinListState: Flow<Resource<List<Coin>>>

    fun onCoinClick(coinId: String)
}