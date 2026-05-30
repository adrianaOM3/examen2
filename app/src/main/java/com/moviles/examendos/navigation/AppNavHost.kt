package com.moviles.examendos.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moviles.examendos.ui.screens.login.LoginScreen
import com.moviles.examendos.ui.screens.tickets.TicketListScreen


@Composable
fun AppNavHost() {

    val navController =
        rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppDestinations.LOGIN
    ) {

        composable(
            AppDestinations.LOGIN
        ) {

            LoginScreen(
                onLoginSuccess = {

                    navController.navigate(
                        AppDestinations.TICKET_LIST
                    ) {
                        popUpTo(
                            AppDestinations.LOGIN
                        ) {
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable(AppDestinations.TICKET_LIST) {

            TicketListScreen(
                navController = navController
            )
        }
    }
}