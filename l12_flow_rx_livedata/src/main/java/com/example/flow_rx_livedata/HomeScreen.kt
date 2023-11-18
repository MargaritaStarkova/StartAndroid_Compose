package com.example.flow_rx_livedata

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = viewModel(),
) {
    // Функция collectAsState подписывается на StateFlow и предоставляет State.
    // Каждый раз, когда значение в StateFlow меняется, обновляется и значение State.
    //
    // Получается такая схема подписки:
    // Composable -> State -> StateFlow
    //
    // Composable читает значение из State, и тем самым подписывается на него,
    // чтобы перезапуститься при изменении значения. А State подписывается на StateFlow.
    // В итоге изменение значения в StateFlow будет приводить к перезапуску Composable функции.
    val counter by homeViewModel.counter.collectAsState()
    Text(
        text = "Clicks: $counter",
        modifier = Modifier.clickable(onClick = homeViewModel::onCounterClick)
    )
}