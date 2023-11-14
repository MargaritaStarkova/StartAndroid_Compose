package com.example.checkbox_textfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val checkedState = mutableStateOf(true)
        setContent {
            CheckboxScreen(
                checked = checkedState,
                onCheckedChange = { newCheckedValue ->
                    checkedState.value = newCheckedValue
                }
            )
        }
    }
}
