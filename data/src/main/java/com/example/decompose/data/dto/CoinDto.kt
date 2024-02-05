package com.example.decompose.data.dto

import com.google.gson.annotations.SerializedName

class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String
)

fun CoinDto.toCoin(): com.example.decompose.domain.model.Coin {
    return com.example.decompose.domain.model.Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}
