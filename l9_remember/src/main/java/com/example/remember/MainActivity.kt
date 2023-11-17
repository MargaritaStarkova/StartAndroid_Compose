package com.example.remember

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val counter = mutableStateOf(0)
        val checkedState = mutableStateOf(true)
        setContent {
            HomeScreen(
                counter = counter,
                checked = checkedState,
                onCounterClick = {counter.value++},
                onCheckedChange = { newCheckedValue ->
                    checkedState.value = newCheckedValue
                }
            )
        }
    }
}
