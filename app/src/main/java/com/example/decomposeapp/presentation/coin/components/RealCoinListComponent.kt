package com.example.decomposeapp.presentation.coin.components

import android.util.Log
import com.arkivanov.decompose.ComponentContext
import com.example.decomposeapp.common.Resource
import com.example.decomposeapp.domain.use_case.GetCoinsUseCase
import com.example.decomposeapp.presentation.coin.coin_state.CoinListState
import com.example.decomposeapp.presentation.util.componentCoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

class RealCoinListComponent @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase,
    private val onItemSelected: (id: String) -> Unit,
    componentContext: ComponentContext
) : ComponentContext by componentContext, CoinListComponent {

    private val coroutineScope = componentCoroutineScope()

    override val coinListState = MutableStateFlow(
        CoinListState()
    )

    init {
        loadCoins()
    }

    private fun loadCoins() {
        Log.d("tag5", "вызов ")
        coroutineScope.launch {
            getCoinsUseCase().onEach { restult ->
                Log.d("tag6", "вызов")
                when (restult) {
                    is Resource.Loading -> {
                        coinListState.update { it.copy(isLoading = true) }
                    }

                    is Resource.Error -> {
                        coinListState.update {
                            it.copy(
                                isLoading = false,
                                error = restult.message ?: "An unexpected error occured"
                            )
                        }
                    }

                    is Resource.Success -> {
                        coinListState.update {
                            it.copy(
                                isLoading = false,
                                coins = restult.data ?: emptyList()
                            )
                        }
                    }
                }
            }.launchIn(coroutineScope)
        }
    }

    override fun onCoinClick(coinId: String) {
        onItemSelected(coinId)
    }
}