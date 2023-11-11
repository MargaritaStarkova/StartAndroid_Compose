package com.example.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val counter = mutableStateOf(0)
        setContent {
            HomeScreen(
                counter = counter,
                onCounterClick = {
                    counter.value++

                }
            )
        }
    }
}

