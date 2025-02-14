package com.example.myconta.presentation.screens.splashscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lottiefiles.dotlottie.core.compose.runtime.DotLottieController
import com.lottiefiles.dotlottie.core.compose.ui.DotLottieAnimation
import com.lottiefiles.dotlottie.core.util.DotLottieEventListener
import com.lottiefiles.dotlottie.core.util.DotLottieSource

@Composable
fun CustomSplashScreen(
    modifier: Modifier = Modifier,
    onFinishAnimation: () -> Unit = {}
) {
    val dotController =  remember { DotLottieController() }

    LaunchedEffect(Unit) {
        val eventListener = object : DotLottieEventListener {
            override fun onComplete() {
                onFinishAnimation()
            }
        }

        dotController.addEventListener(eventListener)
    }

    Box(modifier, contentAlignment = Alignment.Center) {
        DotLottieAnimation(
            source = DotLottieSource.Asset("splash_animation.lottie"),
            modifier = Modifier.size(300.dp),
            autoplay = true,
            controller = dotController
        )
    }
}

@Preview
@Composable
private fun CustomSplashScreenPreview() {
    CustomSplashScreen()
}