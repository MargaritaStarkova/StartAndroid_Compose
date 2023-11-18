package com.example.viewmodel

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = viewModel(),
) {

// Используем by чтобы работать с значением
// State как с обычной переменной. Отображаем значение в
// Text и увеличиваем на 1 по клику.

    val counter by homeViewModel.counter

    Text(
        text = "Clicks $counter",
        modifier = Modifier.clickable(onClick = homeViewModel::onCounterClick)
    )
}