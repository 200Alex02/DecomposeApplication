package com.example.decompose.data.repository

import com.example.decompose.data.remote.api.ApiService
import com.example.decompose.data.remote.dto.toCoin
import com.example.decompose.data.remote.dto.toCoinDetail
import com.example.decompose.domain.model.Coin
import com.example.decompose.domain.model.CoinDetail
import com.example.decompose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: ApiService
) : CoinRepository {

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }

    override suspend fun getCoinById(coinId: String): CoinDetail {
        return api.getCoinById(coinId).toCoinDetail()
    }
}