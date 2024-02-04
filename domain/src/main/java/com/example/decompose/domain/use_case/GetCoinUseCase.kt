package com.example.decompose.domain.use_case


import com.example.decompose.domain.util.Resource
import com.example.decompose.domain.model.Coin
import kotlinx.coroutines.flow.Flow

interface GetCoinUseCase {

    operator fun invoke(): Flow<Resource<List<Coin>>>
}