package org.evolution.app.presenter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons
import compose.icons.feathericons.UserPlus
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import org.evolution.app.presenter.components.ListHorizontalTile
import org.evolution.app.presenter.components.TopBar
import org.evolution.app.presenter.design.NuBox
import org.evolution.app.presenter.design.NuColors
import org.evolution.app.presenter.design.NuDivider
import org.evolution.app.presenter.design.NuIcons
import org.evolution.app.presenter.design.NuSpace
import org.evolution.app.presenter.design.NuText
import org.evolution.app.presenter.design.NuTile

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NubankScreen() {

    Scaffold(
        topBar = {
            TopBar()
        },
        bottomBar = {
            Row(
                modifier = Modifier.fillMaxWidth().height(45.dp).background(
                    NuColors.gray
                ).padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                NuIcons.UserPlus(color = NuColors.purple)
                NuIcons.UserPlus(color = NuColors.black)
                NuIcons.UserPlus(color = NuColors.black)
            }
        }
    ) {
        Column(
            modifier = Modifier.padding(top = 140.dp)
        ) {
            NuTile.TitleIconBrDescription(
                title = "Conta",
                description = "R$ 800,25",
            )

            ListHorizontalTile.Circles(
                modifier = Modifier.padding(top = 15.dp, bottom = 15.dp),
                onClickBoxPix = {
                    Napier.d(message = "Pix clicked", tag = "Home")
                },
                onClickBox = {value ->
                    Napier.d(message = value, tag = "Home")
                },
            )


            NuBox.IconText(
                icon = FeatherIcons.UserPlus,
                text = "Meus Cartões"
            )


            ListHorizontalTile.Boxes(modifier = Modifier.padding(top = 15.dp))

            NuDivider.Line()
                NuTile.TitleIconBrSubtitleBrValue(
                    title = "Cartão de créddito",
                    subtitle = "Fatura atual",
                    value = "R$ 800,25",
                    freeText = "R$ 800,25",
                )
        }
    }
}