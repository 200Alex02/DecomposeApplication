package com.example.decomposeapp.presentation.root_bottom.root_bottom_ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetpack.stack.animation.stackAnimation
import com.example.decomposeapp.presentation.coin_screens.coin_screen_ui.CoinScreensUi
import com.example.decomposeapp.presentation.root_bottom.root_bottom_component.RootBottomComponent
import com.example.decomposeapp.presentation.settings.settings_ui.SettingsUi

data class ScreensBottom(val name: String, val openScreen: () -> Unit, val isSelected: Boolean)

@Composable
fun RootBottomUi(component: RootBottomComponent) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val screens by remember {
        mutableStateOf(
            listOf(
                ScreensBottom("Home", component::openCoin, false),
                ScreensBottom("Settings", component::openSettings, false)
            )
        )
    }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.fillMaxWidth(),
                actions = {
                    screens.forEachIndexed { index, screensBottom ->
                        NavigationBarItem(
                            selected = selectedItem == index,
                            onClick = {
                                selectedItem = index
                                screensBottom.openScreen()
                            },
                            icon = {
                                when (screensBottom.name) {
                                    "Home" -> Icon(Icons.Outlined.Home, contentDescription = null)
                                    "Settings" -> Icon(
                                        Icons.Outlined.Settings,
                                        contentDescription = null
                                    )
                                }
                            },
                            label = {
                                Text(
                                    text = screensBottom.name,
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Light
                                )
                            },
                            colors = NavigationBarItemDefaults.colors(selectedIconColor = MaterialTheme.colorScheme.primary)
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {
                Children(
                    stack = component.childStackBottom,
                    animation = stackAnimation(fade() + scale()),
                ) {
                    when (val child = it.instance) {
                        is RootBottomComponent.ChildBottom.CoinChild -> CoinScreensUi(component = child.component)
                        is RootBottomComponent.ChildBottom.SettingsChild -> SettingsUi()
                    }
                }
            }
        }
    )
}