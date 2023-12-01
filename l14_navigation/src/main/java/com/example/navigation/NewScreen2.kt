package com.example.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NewScreen2(
    onNavigateToOrders: () -> Unit,
    onNavigateToUsers: () -> Unit,
) {
    Column {
        Text(text = "Home screen")

        Text(text = "Orders", modifier = Modifier.clickable(onClick = onNavigateToOrders))
        Text(text = "Users", modifier = Modifier.clickable(onClick = onNavigateToUsers))
    }

}