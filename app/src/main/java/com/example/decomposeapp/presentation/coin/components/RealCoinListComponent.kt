package com.example.decomposeapp.presentation.coin.components

import com.arkivanov.decompose.ComponentContext
import com.example.decomposeapp.common.Resource
import com.example.decomposeapp.domain.use_case.GetCoinsUseCase
import com.example.decomposeapp.presentation.coin.CoinListState
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class RealCoinListComponent @Inject constructor(
    getCoinsUseCase: GetCoinsUseCase,
    private val onItemSelected: (id: String) -> Unit,
    componentContext: ComponentContext
) : ComponentContext by componentContext, CoinListComponent {


    override val coinListState =
        getCoinsUseCase().onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    CoinListState(isLoading = true)
                }

                is Resource.Error -> {
                    CoinListState(error = result.message ?: "")
                }

                is Resource.Success -> {
                    CoinListState(
                        isLoading = false,
                        coins = result.data ?: emptyList()
                    )
                }
            }
        }

    override fun onCoinClick(coinId: String) {
        onItemSelected(coinId)
    }
}