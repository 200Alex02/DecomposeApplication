package com.example.decomposeapp.presentation.root_bottom.root_bottom_ui

data class ScreensBottom(
    val name: String,
    val openScreen: () -> Unit,
    val isSelected: Boolean
)

