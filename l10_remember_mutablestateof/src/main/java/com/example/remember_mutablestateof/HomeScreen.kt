package com.example.remember_mutablestateof

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
@Composable
fun HomeScreen(
    checked: State<Boolean>,
    onCheckedChange: (Boolean) -> Unit,
) {
    val checkedValue = checked.value
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = checkedValue, onCheckedChange = onCheckedChange)
        Text(text = "Some important preference", fontSize = 18.sp)
    }
}*/

@SuppressLint("UnrememberedMutableState")
@Composable
fun HomeScreen() {
    //val checked = remember { mutableStateOf(false) }
    var checked by rememberSaveable { mutableStateOf(false) }
   // val checkedValue = checked.value

    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = checked,
                onCheckedChange = { value -> checked = value })
            Text(text = "More details", fontSize = 18.sp)
        }

        if (checked) {
            Text(
                text = stringResource(id = R.string.details),
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

