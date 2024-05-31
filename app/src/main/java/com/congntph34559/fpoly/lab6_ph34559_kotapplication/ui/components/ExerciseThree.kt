package com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.screens.CinemaSeatBookingScreen
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.utils.createTheaterSeating

@Composable
fun GetLayoutExerciseThree() {
    CinemaSeatBookingScreen(
        createTheaterSeating(
            totalRows = 12,
            totalSeatsPerRow = 9,
            aislePositionInRow = 4,
            aislePositionInColumn = 5
        ), totalSeatsPerRow = 9
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingExerciseThree() {
    GetLayoutExerciseThree()
}