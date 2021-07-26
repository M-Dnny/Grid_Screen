package com.example.grid_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

private val items = listOf(
    Icons.Default.AccountBox,
    Icons.Default.ArrowBack,
    Icons.Default.AccountCircle,
    Icons.Default.Add,
    Icons.Default.ExitToApp,
    Icons.Default.AccountBox,
    Icons.Default.ArrowBack,
    Icons.Default.AccountCircle,
    Icons.Default.Add,
    Icons.Default.ExitToApp,
    Icons.Default.AccountBox,
    Icons.Default.ArrowBack,
    Icons.Default.AccountCircle,
    Icons.Default.Add,
    Icons.Default.ExitToApp,
    Icons.Default.AccountBox,
    Icons.Default.ArrowBack,
    Icons.Default.AccountCircle,
    Icons.Default.Add,
    Icons.Default.ExitToApp,
    Icons.Default.AccountBox,
    Icons.Default.ArrowBack,
    Icons.Default.AccountCircle,
    Icons.Default.Add,
    Icons.Default.ExitToApp,
    Icons.Default.AccountBox,
    Icons.Default.ArrowBack,
    Icons.Default.AccountCircle,
    Icons.Default.Add,
    Icons.Default.ExitToApp,
    Icons.Default.Add,
    Icons.Default.ExitToApp,
    Icons.Default.AccountBox,
    Icons.Default.ArrowBack,
    Icons.Default.AccountCircle,
    Icons.Default.Add,
    Icons.Default.ExitToApp,
    Icons.Default.AccountBox,
    Icons.Default.ArrowBack,
    Icons.Default.AccountCircle,
)

@ExperimentalFoundationApi
@Composable
fun GridScreen() {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        cells = GridCells.Fixed(3),
        content = {
            items(items)
            { item -> GridIcon(IconResource(item, true)) }
        }
    )
}

@Composable
fun GridIcon(iconResource: IconResource) {
    //TODO add your code here
    val color = if (iconResource.isVisible)
        Color.Red
    else Color.Transparent
    Icon(
        imageVector = iconResource.imageVector, contentDescription = null,
        tint = color,
        modifier = Modifier
            .size(80.dp, 80.dp)
    )
}

data class IconResource(val imageVector: ImageVector, val isVisible: Boolean)