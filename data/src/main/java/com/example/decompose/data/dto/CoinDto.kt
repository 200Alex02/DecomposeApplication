package com.example.decompose.data.dto

import com.example.decompose.domain.model.Coin
import com.google.gson.annotations.SerializedName

class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}
