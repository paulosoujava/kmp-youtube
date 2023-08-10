package org.evolution.app.presenter.design
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


object NuTile {
    @Composable
    fun TitleIconBrDescription(
        title: String,
        description: String,
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = modifier.fillMaxWidth().padding(10.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                NuText.Title(title, modifier = Modifier.weight(4f), color = NuColors.black)
                NuIcons.KeyboardArrowRight( color = NuColors.black)
            }
            NuSpace.Small()
            NuText.SubTitleBold(description, color = NuColors.black, modifier = Modifier.padding(start = 12.dp))
        }
    }

    @Composable
    fun TitleIconBrSubtitleBrValue(
        title: String,
        subtitle: String,
        value: String,
        freeText: String,
        modifier: Modifier= Modifier
    ) {
        Column(
            modifier = modifier.padding(start = 10.dp).fillMaxWidth().padding(10.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                NuText.Title(title, modifier = Modifier.weight(4f), color = NuColors.black)
                NuIcons.KeyboardArrowRight(color = NuColors.black)
            }
            NuSpace.Small()
            NuText.SubTitle(subtitle, color = NuColors.black)
            NuText.SmallTitle(value, color = NuColors.black)
        }
    }
}