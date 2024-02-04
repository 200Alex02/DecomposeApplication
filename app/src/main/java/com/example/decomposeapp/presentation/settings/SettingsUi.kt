package com.example.decomposeapp.presentation.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.example.decomposeapp.R

@Composable
fun SettingsUi() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(id = R.string.about_app),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = MaterialTheme.typography.displaySmall.fontSize,
                color = MaterialTheme.colorScheme.primary
            )
        )
    }
}