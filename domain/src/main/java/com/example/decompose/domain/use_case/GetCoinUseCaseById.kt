package com.example.decompose.domain.use_case

import com.example.decompose.domain.util.Resource
import com.example.decompose.domain.model.CoinDetail
import kotlinx.coroutines.flow.Flow

interface GetCoinUseCaseById {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>>
}