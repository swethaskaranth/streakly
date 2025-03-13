package com.kaizencoder.streakly.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kaizencoder.streakly.Greeting
import com.kaizencoder.streakly.ui.theme.StreaklyTheme

@Composable
fun HomeScreen() {

    StreaklyTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = { HomeNavigationBar() }) { innerPadding ->
            Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }

}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}