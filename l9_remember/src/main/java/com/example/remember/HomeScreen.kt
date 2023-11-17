package com.example.remember

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    counter: State<Int>,
    checked: State<Boolean>,
    onCounterClick: () -> Unit,
    onCheckedChange: (Boolean) -> Unit,
) {
    val counterValue = counter.value
    val checkedValue = checked.value
    Log.d("MyLog", "HomeScreen, counterValue = $counterValue, checkedValue = $checkedValue")
    Row {
        ClickCounter(counterValue = counterValue, onCounterClick = onCounterClick, uppercase = checkedValue )
        Checkbox(checked = checkedValue, onCheckedChange = onCheckedChange)
    }
}



@Composable
fun ClickCounter(
    uppercase: Boolean,
    counterValue: Int,
    onCounterClick: () -> Unit,
) {
    Log.d("MyLog", "ClickCounter $counterValue")
    val evenOdd = remember(uppercase) { EvenOdd(uppercase) }
    Text(
        text = "Clicks: $counterValue ${evenOdd.check(counterValue)}",
        modifier = Modifier.clickable(onClick = onCounterClick)
    )
    Log.d("MyLog", "ClickCounter(counter = $counterValue, uppercase = $uppercase), $evenOdd}")
}