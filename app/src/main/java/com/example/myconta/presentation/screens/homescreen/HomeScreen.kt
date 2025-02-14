package com.example.myconta.presentation.screens.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(Modifier.fillMaxSize().background(color = Color.Red))
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}