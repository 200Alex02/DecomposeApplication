package com.example.decomposeapp.presentation.coin.ui


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.decomposeapp.R
import com.example.decomposeapp.presentation.coin.components.CoinListComponent

@Composable
fun CoinListUi(
    component: CoinListComponent
) {
    val state = component.coinListState.collectAsState()

    val lazyListState = rememberLazyListState()

    val isScrollToEnd by remember {
        derivedStateOf {
            lazyListState.layoutInfo.visibleItemsInfo.lastOrNull()?.index == lazyListState.layoutInfo.totalItemsCount - 1
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = lazyListState
        ) {
            items(
                state.value.coins,
                key = { coin -> coin.id },
                contentType = { it.id }
            ) { coin ->
                CoinListItem(
                    coin = coin,
                    onItemClick = {
                        component.onCoinClick(coin.id)
                    }
                )
            }
            item {
                if (component.startLoadData.value) {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }
            }
        }
        LaunchedEffect(!isScrollToEnd) {
            if (!isScrollToEnd && !state.value.isLoading) {
                component.refreshData()
            }
        }
        if (state.value.error.isNotBlank()) {
            Column(
                modifier = Modifier.align(Alignment.Center)
            ) {
                Text(
                    text = state.value.error,
                    color = MaterialTheme.colorScheme.error,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                )
                Button(
                    modifier = Modifier.padding(top = 10.dp, end = 20.dp, start = 20.dp),
                    onClick = {
                        component.restartData()
                    })
                {
                    Text(
                        text = stringResource(id = R.string.retry_button),
                        color = MaterialTheme.colorScheme.onTertiary,
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
        if (state.value.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}
