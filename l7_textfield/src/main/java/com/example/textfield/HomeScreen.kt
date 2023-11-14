package com.example.textfield

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    text: State<String>,
    onValueChanged: (String) -> Unit,
) {
    val textValue = text.value
    OutlinedTextField(value = textValue, onValueChange = onValueChanged)
}