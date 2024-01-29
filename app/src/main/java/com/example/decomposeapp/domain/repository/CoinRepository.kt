package com.example.decomposeapp.domain.repository

import com.example.decomposeapp.data.remote.dto.CoinDetailDto
import com.example.decomposeapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}