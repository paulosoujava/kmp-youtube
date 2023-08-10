package org.evolution.app.presenter.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

object NuBox {

    @Composable
    fun IconText(
        icon: ImageVector,
        text: String
    ) {
        Box(
            modifier = Modifier
                .padding(start = 10.dp)
                .clip(RoundedCornerShape(8.dp))
                .size(300.dp, 56.dp)
                .background(NuColors.gray),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier.padding(16.dp).fillMaxWidth().padding(start = 10.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                NuIcons.Custom(icon, color = NuColors.black)
                NuText.SubTitleBold(
                    text,
                    color = NuColors.black,
                )
            }

        }
    }

    @Composable
    fun FreeText(
        freeText: String
    ) {
        Box(
            modifier = Modifier
                .padding(start = 10.dp)
                .clip(RoundedCornerShape(8.dp))
                .width(280.dp)
                .background(NuColors.gray),
            contentAlignment = Alignment.Center
        ) {

            NuText.SmallTitle(
                text = freeText,
                color = NuColors.black,
                modifier = Modifier.padding(24.dp)
            )
        }
    }

}