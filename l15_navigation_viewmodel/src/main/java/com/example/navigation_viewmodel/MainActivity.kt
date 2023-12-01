package com.example.navigation_viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                var route by remember { mutableStateOf("userList") }
                Box(modifier = Modifier.weight(1f)) {
                    when (route) {
                        "userList" -> UserListScreen(
                            onUser1Click = { route = "user/1" },
                            onUser2Click = { route = "user/2" }
                        )

                        "user/1" -> UserScreen(id = "1")
                        "user/2" -> UserScreen(id = "2")
                    }
                }
                Text(
                    text = "Users",
                    modifier = Modifier.clickable { route = "userList" }
                )
            }
        }
    }
}
