package com.example.decomposeapp.presentation.coin_detail.components

import com.arkivanov.decompose.ComponentContext
import com.example.decomposeapp.common.Resource
import com.example.decomposeapp.domain.use_case.GetCoinUseCaseById
import com.example.decomposeapp.presentation.coin_detail.coin_detail_state.CoinDetailState
import com.example.decomposeapp.presentation.util.componentCoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

class RealCoinDetailComponent @Inject constructor(
    private val getCoinUseCaseById: GetCoinUseCaseById,
    private val coinId: String,
    private val onBackClick: () -> Unit,
    componentContext: ComponentContext
) : ComponentContext by componentContext, CoinDetailComponent {

    private val coroutineScope = componentCoroutineScope()

    override val coinDetailState = MutableStateFlow(
        CoinDetailState()
    )

    init {
        loadCoinDetail()
    }

    private fun loadCoinDetail() {
        coroutineScope.launch {
            getCoinUseCaseById(coinId).onEach { result ->
                when (result) {
                    is Resource.Loading -> {
                        coinDetailState.update { it.copy(isLoading = true) }
                    }

                    is Resource.Error -> {
                        coinDetailState.update {
                            it.copy(
                                isLoading = false,
                                error = result.message ?: "An unexpected error occured"
                            )
                        }
                    }

                    is Resource.Success -> {
                        coinDetailState.update { it.copy(isLoading = false, coin = result.data) }
                    }
                }
            }.launchIn(coroutineScope)
        }
    }

    override fun onBackClick() {
        onBackClick.invoke()
    }
}