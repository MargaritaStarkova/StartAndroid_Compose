package com.example.uistate

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = viewModel(),
) {

    //Если в вашей модели есть продолжительный Flow (например - получение текущих координат),
    // на который вы подписываетесь в UI, то имеет смысл вместо collectAsState
    // использовать функцию collectAsStateWithLifecycle.
    // Она будет держать подписку на Flow с соблюдением Lifecycle.

    val uiState by homeViewModel.uiState.collectAsState()

    Column {
        ClickCounter(counter = uiState.count, onCounterClick = homeViewModel::onCounterClick)
        EnableFeature(enabled = uiState.enabled, onEnabledChange = homeViewModel::setEnabled)
    }
}

@Composable
fun HomeScreen(
    uiState: HomeScreenUiState,
    onCounterClick: () -> Unit,
    onEnabledChange: (Boolean) -> Unit,
) {
    Column {
        ClickCounter(counter = uiState.count, onCounterClick = onCounterClick)
        EnableFeature(enabled = uiState.enabled, onEnabledChange = onEnabledChange)
    }
}

@Composable
fun ClickCounter(
    counter: Int,
    onCounterClick: () -> Unit,
) {

    Text(
        text = "Clicks: $counter",
        modifier = Modifier.clickable(onClick = onCounterClick)
    )
}

@Composable
fun EnableFeature(
    enabled: Boolean,
    onEnabledChange: (Boolean) -> Unit,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = enabled, onCheckedChange = onEnabledChange)
        Text(text = "enable feature")
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        uiState = HomeScreenUiState(count = 5, enabled = true),
        onCounterClick = { },
        onEnabledChange = { }
    )
}