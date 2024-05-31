package com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.model.entities.Movie
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.components.GetLayoutExerciseOne
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.components.GetLayoutExerciseThree
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.components.GetLayoutExerciseTwo
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.components.GetLayoutHomeScreens


enum class ROUTE {
    home,
    bai1,
    bai2,
    bai3
}

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier, navController: NavHostController,
    startDestination: String = ROUTE.home.name
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(ROUTE.home.name) { GetLayoutHomeScreens(navController) }
        composable(ROUTE.bai1.name) { GetLayoutExerciseOne(movie = Movie.getSampleMovie()) }
        composable(ROUTE.bai2.name) { GetLayoutExerciseTwo(movies = Movie.getSampleMovie()) }
        composable(ROUTE.bai3.name) { GetLayoutExerciseThree() }
    }
}
