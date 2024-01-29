package com.example.decomposeapp.data.repository

import com.example.decomposeapp.data.remote.api.ApiService
import com.example.decomposeapp.data.remote.dto.CoinDetailDto
import com.example.decomposeapp.data.remote.dto.CoinDto
import com.example.decomposeapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: ApiService
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}