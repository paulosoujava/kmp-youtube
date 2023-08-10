package org.evolution.app.presenter.design

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object NuText {

    @Composable
    fun Title(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = NuColors.black,
    ) {
        return Text(
            text = text,
            modifier = modifier,
            style = MaterialTheme.typography.headlineLarge,
            color = color,
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal
        )
    }

    @Composable
    fun SubTitle(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = NuColors.black,
    ) {
        return auxTextBoldOrRegular(
            text = text,
            modifier = modifier,
            fontWeight = FontWeight.Normal,
            color = color
        )
    }

    @Composable
    fun SubTitleBold(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = NuColors.black,
    ) {
        return auxTextBoldOrRegular(
            text = text,
            modifier = modifier,
            fontWeight = FontWeight.Bold,
            color = color
        )
    }

    @Composable
    fun SmallTitle(
        text: String, modifier: Modifier = Modifier,
        color: Color = NuColors.black,
    ) {
        return Text(
            text = text,
            modifier = modifier,
            style = MaterialTheme.typography.bodySmall,
            color = color,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        )
    }

    @Composable
    private fun auxTextBoldOrRegular(
        text: String,
        modifier: Modifier,
        fontWeight: FontWeight,
        color: Color
    ) {
        return Text(
            text = text,
            modifier = modifier,
            style = MaterialTheme.typography.bodyMedium,
            color = color,
            fontSize = 18.sp,
            fontWeight = fontWeight
        )
    }
}