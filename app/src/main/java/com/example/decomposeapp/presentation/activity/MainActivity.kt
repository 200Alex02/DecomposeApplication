package com.example.decomposeapp.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.retainedComponent
import com.example.decomposeapp.presentation.root_bottom.root_bottom_component.RealRootBottomComponent
import com.example.decomposeapp.presentation.root_bottom.root_bottom_ui.RootBottomUi
import com.example.decomposeapp.ui.theme.DecomposeAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var rootBottomComponent: RealRootBottomComponent.Factory
    @OptIn(ExperimentalDecomposeApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = retainedComponent { rootBottomComponent.create(it) }
        setContent {
            DecomposeAppTheme {
                RootBottomUi(component = root)
            }
        }
    }
}
