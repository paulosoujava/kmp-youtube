package org.evolution.app.presenter.design

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

object NuDivider {
    @Composable
    fun Line(modifier: Modifier = Modifier) {
        //NuSpace.Medium()
        Divider(
            modifier = modifier.fillMaxWidth().padding(top = 15.dp, bottom = 15.dp),
            color = NuColors.black.copy(alpha = 0.2f),
            thickness = 1.dp
        )
        //NuSpace.Medium()
    }

}