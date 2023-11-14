package com.example.checkbox_textfield

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun CheckboxScreen(
    checked: State<Boolean>,
    onCheckedChange: (Boolean) -> Unit,
) {
    val checkedValue = checked.value
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = checkedValue, onCheckedChange = onCheckedChange)
        Text(
            text = "Some checkbox text",
            fontSize = 18.sp,
            modifier = Modifier.clickable { onCheckedChange(!checkedValue) }
        )
    }
}
