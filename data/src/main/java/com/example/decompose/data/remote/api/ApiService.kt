package com.example.decompose.data.remote.api

import com.example.decompose.data.remote.dto.CoinDetailDto
import com.example.decompose.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}