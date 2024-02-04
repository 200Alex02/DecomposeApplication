package com.example.decomposeapp.presentation.coin_detail.components

import com.arkivanov.decompose.ComponentContext
import com.example.decompose.domain.util.Resource
import com.example.decompose.domain.use_case.GetCoinUseCaseById
import com.example.decomposeapp.presentation.coin_detail.coin_detail_state.CoinDetailState
import com.example.decomposeapp.presentation.util.componentCoroutineScope
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class RealCoinDetailComponent @AssistedInject constructor(
    private val getCoinUseCaseById: GetCoinUseCaseById,
    private val coinId: String,
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

    /*@AssistedFactory
    interface Factory{
        fun create(
            @Assisted("componentContext") componentContext: ComponentContext,
            @Assisted("coinId") coinId: String
        ): RealCoinDetailComponent
    }*/

}