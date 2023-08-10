package org.evolution.app

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import org.evolution.app.presenter.NubankScreen
import org.evolution.app.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun App() = AppTheme {
   NubankScreen()
}

