package com.congntph34559.fpoly.lab6_ph34559_kotapplication.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.navigation.AppNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavHost(navController = rememberNavController())
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppNavHost(navController = rememberNavController())
}