package com.example.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .size(200.dp)
            .border(2.dp, Color.Red)
            .padding(32.dp)
            .border(2.dp, Color.Black)
            .background(Color.Green)
    ) {
        Text(text = "Some text", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(8.dp))
        MyButton(text = "Button", onClick = { TODO() })
    }
}

@Composable
fun MyButton(
    text: String,
    onClick: () -> Unit,
) {
    Text(
        text = text, modifier = Modifier
            .clickable(onClick = onClick)
            .border(1.dp, Color.Black, RoundedCornerShape(4.dp))
            .padding(8.dp)
    )
}