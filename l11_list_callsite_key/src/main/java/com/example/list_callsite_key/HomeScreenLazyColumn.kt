package com.example.list_callsite_key

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Log.d("MyLog", "HomeScreen: +++")
    val list = remember {
        List(20) { "Item ${it + 1}" }.toMutableStateList()
    }


    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        contentPadding = PaddingValues(16.dp),
        modifier = Modifier
            .border(width = 2.dp, color = Color.Green)
            //.padding(16.dp)

    ) {
        items(list) { item ->
            SomeItem(text = item)
        }
    }
}

