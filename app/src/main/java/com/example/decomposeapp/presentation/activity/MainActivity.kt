package com.example.decomposeapp.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.retainedComponent
import com.example.decomposeapp.domain.use_case.GetCoinUseCaseById
import com.example.decomposeapp.domain.use_case.GetCoinsUseCase
import com.example.decomposeapp.presentation.coin_screens_component.CoinScreensUi
import com.example.decomposeapp.presentation.coin_screens_component.RealCoinScreensComponent
import com.example.decomposeapp.ui.theme.DecomposeAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var getCoinsUseCase: GetCoinsUseCase

    @Inject
    lateinit var getCoinsUseCaseById: GetCoinUseCaseById
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = retainedComponent {
            RealCoinScreensComponent(
                componentContext = it, getCoinsUseCase = getCoinsUseCase,
                getCoinUseCaseById = getCoinsUseCaseById
            )
        }
        setContent {
            DecomposeAppTheme {
                CoinScreensUi(component = root)
            }
        }
    }
}
