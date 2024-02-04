package com.example.decompose.domain.repository

import com.example.decompose.domain.model.Coin
import com.example.decompose.domain.model.CoinDetail

interface CoinRepository {
    suspend fun getCoins(): List<Coin>

    suspend fun getCoinById(coinId: String): CoinDetail
}