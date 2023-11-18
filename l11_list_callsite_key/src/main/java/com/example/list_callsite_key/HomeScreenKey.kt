package com.example.list_callsite_key

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreenKey() {
    Log.d("MyLog", "HomeScreen: +++")
    val list = remember {
        mutableStateListOf("Item 1", "Item 2", "Item 3", "Item 4")
    }
    Column {
        TextButton(onClick = {
            Log.d("MyLog", "HomeScreen: --- insert ---")
            list.add(0, "Item ${list.size + 1}")
        }) {
            Text(text = "insert")
        }
        list.forEach { value ->
            //добавляем key для того чтобы Recomposition оптимизировал создание экземпляров
            key(value) {
                SomeItem(text = value)
            }
        }
    }

}

@Composable
fun SomeItem(text: String) {
    Log.d("MyLog", "SomeItem text = $text")
    Text(
        text = text, fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.Black)
            .padding(16.dp)
    )
}