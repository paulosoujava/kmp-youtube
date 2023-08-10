package org.evolution.app.presenter.design

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.FeatherIcons
import compose.icons.feathericons.AlignJustify
import compose.icons.feathericons.Eye
import compose.icons.feathericons.HelpCircle
import compose.icons.feathericons.UserPlus

object NuIcons {

    @Composable
    fun Custom(icon: ImageVector, modifier: Modifier = Modifier,
               color: Color = NuColors.white
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "Default icon",
            modifier = modifier,
            tint = color
        )
    }

    @Composable
    fun AlignJustify(modifier: Modifier = Modifier,
            color: Color = NuColors.white
    ) {
        Icon(
            imageVector = FeatherIcons.AlignJustify,
            contentDescription = "Icon eyes",
            modifier = modifier,
            tint = color
        )
    }

    @Composable
    fun Eye(modifier: Modifier = Modifier,
             color: Color = NuColors.white
    ) {
        Icon(
            imageVector = FeatherIcons.Eye,
            contentDescription = "Icon eyes",
            modifier = modifier,
            tint = color
        )
    }
    @Composable
    fun KeyboardArrowRight(modifier: Modifier = Modifier,
                  color: Color = NuColors.white
    ) {
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "Icon info",
            modifier = modifier,
            tint = color
        )
    }
    @Composable
    fun HelpCircle(modifier: Modifier = Modifier,
             color: Color = NuColors.white
    ) {
        Icon(
            imageVector = FeatherIcons.HelpCircle,
            contentDescription = "Icon info",
            modifier = modifier,
            tint = color
        )
    }

    @Composable
    fun UserPlus(modifier: Modifier = Modifier,
                    color: Color = NuColors.white
    ) {
        Icon(
            imageVector = FeatherIcons.UserPlus,
            contentDescription = "Icon send invite",
            modifier = modifier,
            tint = color
        )
    }
}