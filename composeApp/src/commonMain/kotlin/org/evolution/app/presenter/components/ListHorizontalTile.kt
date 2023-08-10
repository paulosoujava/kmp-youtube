package org.evolution.app.presenter.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import compose.icons.FeatherIcons
import compose.icons.feathericons.AlignJustify
import compose.icons.feathericons.HelpCircle
import org.evolution.app.presenter.design.NuBox
import org.evolution.app.presenter.design.NuCircle
import org.evolution.app.presenter.design.NuTile

object ListHorizontalTile {
    @Composable
    fun Circles(
        modifier: Modifier = Modifier,
        onClickBoxPix: () -> Unit,
        onClickBox: (String) -> Unit,
    ) {
        LazyRow(modifier = modifier) {
            item {
                Box(modifier = Modifier.clickable {
                    onClickBoxPix()
                }) {
                    NuCircle.CircleIcon(
                        icon = FeatherIcons.AlignJustify,
                        value = "R$ 800,25",
                        titleCircle = "Pix"
                    )
                }

            }
            items(13) {
                Box(modifier = Modifier.clickable {
                    onClickBox("Title $it")
                }) {
                    NuCircle.CircleIcon(
                        icon = FeatherIcons.HelpCircle,
                        titleCircle = "Title $it"
                    )
                }
            }
        }
    }

    @Composable
    fun Boxes(modifier: Modifier = Modifier) {
        LazyRow(modifier = modifier) {
            items(3) {
                NuBox.FreeText("E vocÊ, o que vai fazer com seu\nPedacinho? Decida agora!")
            }
        }
    }
}
