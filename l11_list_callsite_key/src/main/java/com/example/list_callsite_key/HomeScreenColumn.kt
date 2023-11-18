package com.example.list_callsite_key

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun HomeScreenColumn() {
    Log.d("MyLog", "HomeScreen: +++")
    val list = remember {
        List(20) { "Item ${it + 1}" }.toMutableStateList()
    }

    // Используя переменную scrollState
    // мы можем узнать текущую позицию скролла или выполнить скролл программно.
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        list.forEach { value ->
            key(value) {
                SomeItem(text = value)
            }
        }
    }
}
