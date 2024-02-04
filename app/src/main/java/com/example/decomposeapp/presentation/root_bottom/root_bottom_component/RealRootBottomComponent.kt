package com.example.decomposeapp.presentation.root_bottom.root_bottom_component

import androidx.compose.runtime.mutableIntStateOf
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.bringToFront
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.backhandler.BackCallback
import com.arkivanov.essenty.parcelable.Parcelable
import com.example.decomposeapp.factory.RootComponentFactory
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.parcelize.Parcelize

class RealRootBottomComponent @AssistedInject constructor(
    private val rootComponentFactory: RootComponentFactory,
    @Assisted("componentContext") componentContext: ComponentContext,
) : ComponentContext by componentContext, RootBottomComponent {

    private val navigationBottomStackNavigation = StackNavigation<ConfigBottom>()

    override val childStackBottom: Value<ChildStack<*, RootBottomComponent.ChildBottom>> =
        childStack(
            source = navigationBottomStackNavigation,
            initialConfiguration = ConfigBottom.Coin,
            handleBackButton = true,
            childFactory = { config, componentContext ->
                rootComponentFactory.create(config, componentContext)
            }
        )

    override fun openCoin() {
        navigationBottomStackNavigation.bringToFront(ConfigBottom.Coin)
    }

    override fun openSettings() {
        navigationBottomStackNavigation.bringToFront(ConfigBottom.Settings)
    }

    override val selectedItem = mutableIntStateOf(0)

    override fun onBack() {
        selectedItem.intValue = 0
        navigationBottomStackNavigation.pop()
    }

    sealed interface ConfigBottom : Parcelable {

        @Parcelize
        data object Coin : ConfigBottom

        @Parcelize
        data object Settings : ConfigBottom
    }

    private val backCallBack = BackCallback {
        onBack()
    }

    init {
        registerBackHandler()
    }

    private fun registerBackHandler() {
        backHandler.register(backCallBack)

        childStackBottom.observe {
            val isFirstTab = it.active.configuration == ConfigBottom.Coin
            backCallBack.isEnabled = !isFirstTab
        }
    }
    @AssistedFactory
    interface Factory {

        fun create(
            @Assisted("componentContext") componentContext: ComponentContext,
        ): RealRootBottomComponent

    }
}