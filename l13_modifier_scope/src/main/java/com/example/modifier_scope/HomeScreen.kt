package com.example.modifier_scope

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Some text", modifier = Modifier.align(CenterHorizontally))
    }
}
//==================================================================================================
/*
Чтобы вызов функции не создавал новый экземпляр Modifier,
можно сохранить Modifier в переменную вне этой функции:

val someModifier = Modifier.fillMaxWidth()
    .background(Color.Gray)
    .padding(16.dp)

@Composable
fun SomeAnimatedUi(...) {
    Column(
        modifier = someModifier
    ) {
        ...
    }
}*/

// Чтобы соединять готовые Modifier наборы друг с другом, можно использовать оператор then:
// Column(modifier = modifier1.then(modifier2)) { … }

