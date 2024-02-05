package com.example.decomposeapp.presentation.coin.components

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.arkivanov.decompose.ComponentContext
import com.example.decompose.domain.use_case.GetCoinUseCase
import com.example.decomposeapp.presentation.coin.coin_state.CoinListState
import com.example.decomposeapp.presentation.util.componentCoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.math.min

class RealCoinListComponent @Inject constructor(
    private val getCoinsUseCase: GetCoinUseCase,
    private val onItemSelected: (id: String) -> Unit,
    componentContext: ComponentContext
) : ComponentContext by componentContext, CoinListComponent {

    private val coroutineScope = componentCoroutineScope()

    private val initialDisplayCount = 20

    private val fullCoinList = mutableListOf<com.example.decompose.domain.model.Coin>()
    private val displayedCoinList = mutableListOf<com.example.decompose.domain.model.Coin>()

    override val coinListState = MutableStateFlow(
        CoinListState()
    )

    override val startLoadData: MutableState<Boolean> = mutableStateOf(false)

    override fun refreshData() {
        if (!coinListState.value.isLoading) {
            startLoadData.value = true
        }
        val remainingItems = fullCoinList.size - displayedCoinList.size
        if (remainingItems > 0) {
            val itemsToAdd = fullCoinList.subList(
                displayedCoinList.size,
                displayedCoinList.size + min(remainingItems, initialDisplayCount)
            )
            displayedCoinList.addAll(itemsToAdd)
            coinListState.value = CoinListState(
                isLoading = false,
                coins = displayedCoinList
            )
            startLoadData.value = false
        }
    }

    override fun restartData() {
        loadCoins()
    }

    init {
        loadCoins()
    }

    private fun loadCoins() {
        coroutineScope.launch {
            getCoinsUseCase().onEach { result ->
                when (result) {
                    is com.example.decompose.domain.util.Resource.Loading -> {
                        coinListState.update { it.copy(isLoading = true) }
                    }

                    is com.example.decompose.domain.util.Resource.Error -> {
                        coinListState.update {
                            it.copy(
                                isLoading = false,
                                error = result.message ?: "An unexpected error occurred"
                            )
                        }
                    }

                    is com.example.decompose.domain.util.Resource.Success -> {
                        fullCoinList.addAll(result.data ?: emptyList())

                        displayedCoinList.addAll(fullCoinList.take(initialDisplayCount))

                        coinListState.update {
                            it.copy(
                                isLoading = false,
                                coins = displayedCoinList
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