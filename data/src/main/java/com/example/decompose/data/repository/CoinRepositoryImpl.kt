package com.example.decompose.data.repository

import com.example.decompose.data.remote.api.ApiService
import com.example.decompose.data.dto.toCoin
import com.example.decompose.data.dto.toCoinDetail
import com.example.decompose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: ApiService
) : CoinRepository {

    override suspend fun getCoins(): List<com.example.decompose.domain.model.Coin> {
        return api.getCoins().map { it.toCoin() }
    }

    override suspend fun getCoinById(coinId: String): com.example.decompose.domain.model.CoinDetail {
        return api.getCoinById(coinId).toCoinDetail()
    }
}