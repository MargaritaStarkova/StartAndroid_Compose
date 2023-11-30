package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "home",
                    modifier = Modifier.weight(1f)
                    ) {
                    composable(route = "home") { HomeScreen(
                        onNavigateToUsers = { navController.navigate("users/56969") },
                        onNavigateToOrders = { navController.navigate("orders") }

                    ) }
                    composable(route = "orders") { OrdersScreen() }
                    composable(
                        route = "users/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.StringType })
                    ) {
                        val userId = it.arguments?.getString("id") ?: ""
                        UsersScreen(id = userId)
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Home",
                        modifier = Modifier.clickable { navController.navigate("home") })
                    Text(
                        text = "Orders",
                        modifier = Modifier.clickable { navController.navigate("orders") })
                    Text(
                        text = "Users",
                        modifier = Modifier.clickable { navController.navigate("users/123") })
                }
            }

        }
    }
}
