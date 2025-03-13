package com.kaizencoder.streakly.ui.screens.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeNavigationBar(modifier: Modifier = Modifier) {
    NavigationBar {
        NavigationBarItem(
            label = {
                Text("Home")
            },
            icon = { Icon(Icons.Default.Home, contentDescription = "home") },
            onClick = {},
            selected = true
        )

        NavigationBarItem(
            label = {
                Text("Tasks")
            },
            icon = { Icon(Icons.Default.DateRange, contentDescription = "home") },
            onClick = {},
            selected = false
        )

        NavigationBarItem(
            label = {
                Text("Habits")
            },
            icon = { Icon(Icons.Default.DateRange, contentDescription = "home") },
            onClick = {},
            selected = false
        )
    }
}

@Preview
@Composable
private fun NavigationBarPreview() {
    HomeNavigationBar()

}