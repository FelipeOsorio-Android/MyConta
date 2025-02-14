package com.example.myconta

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyContaApp(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {}
) {
    content()
}

@Preview
@Composable
private fun MyContaAppPreview() {
    MyContaApp()
}