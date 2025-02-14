package com.example.myconta.presentation.navigation.navhost

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myconta.presentation.screens.homescreen.HomeScreen
import com.example.myconta.presentation.screens.splashscreen.CustomSplashScreen
import kotlinx.serialization.Serializable

@Serializable
object SplashScreen

@Serializable
object HomeScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {

    NavHost(navController = navController, startDestination = SplashScreen) {
        composable<SplashScreen> {
            CustomSplashScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White),
                onFinishAnimation = {
                    navController.navigate(HomeScreen)
                }
            )
        }
        composable<HomeScreen> {
            HomeScreen()
        }
    }

}