package com.example.flow_rx_livedata

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen2(
    homeViewModel: HomeViewModel = viewModel(),
) {
    val counter by homeViewModel.counter.collectAsState()
    ClickCounter(
        counter = counter,
        onCounterClick = homeViewModel::onCounterClick
    )
}

@Composable
fun ClickCounter(
    counter: Int,
    onCounterClick: () -> Unit
) {

    Text(
        text = "Clicks: $counter",
        modifier = Modifier.clickable(onClick = onCounterClick)
    )
}

@Preview(showBackground = true)
@Composable
fun ClickCounterPreview() {
    ClickCounter(counter = 5) {

    }
}