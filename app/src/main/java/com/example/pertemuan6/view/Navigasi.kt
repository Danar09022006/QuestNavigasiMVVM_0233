package com.example.pertemuan6.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,

            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {
            composable(route = Navigasi.FormulirSaya.name) {
                onSubmitBtnClick = {
                    navController.navigate(Navigasi.Detail.name)
                }
            }
        }
        composable(route = Navigasi.Detail.name) {
            TampilData(
                onBackBtnClick = { cancelAndBackToFormulirSaya(navController) }
            )
        }
    }
}



