package org.evolution.app.presenter.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import org.evolution.app.presenter.design.NuColors
import org.evolution.app.presenter.design.NuIcons
import org.evolution.app.presenter.design.NuText

@Composable
fun TopBar() {
    Napier.base(DebugAntilog())
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .background(NuColors.purple)
    ) {
        Row(
            modifier = Modifier
                .padding(13.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.weight(1f)
            ) {
                NuIcons.AlignJustify(modifier = Modifier.clickable {
                    Napier.d(message = "AlignJustify clicked", tag = "Home")
                })
            }
            NuIcons.Eye(modifier = Modifier.padding(end = 20.dp))

            NuIcons.HelpCircle(modifier = Modifier.padding(end = 20.dp))

            NuIcons.UserPlus(modifier = Modifier.padding(end = 20.dp))

        }

        NuText.Title(
            "Olá, Dev",
            color = NuColors.white,
            modifier = Modifier.padding(10.dp)
        )

    }
}