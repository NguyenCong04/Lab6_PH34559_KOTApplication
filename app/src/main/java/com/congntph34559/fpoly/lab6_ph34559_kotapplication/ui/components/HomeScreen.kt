package com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.navigation.ROUTE

@Composable
fun GetLayoutHomeScreens(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = { navController.navigate(ROUTE.bai1.name) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Exercise 1")
        }
        Button(
            onClick = { navController.navigate(ROUTE.bai2.name) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Exercise 2")
        }
        Button(
            onClick = { navController.navigate(ROUTE.bai3.name) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Exercise 3")
        }


    }

}