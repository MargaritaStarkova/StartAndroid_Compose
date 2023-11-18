package com.example.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    private val _counter = mutableStateOf(0)
    val counter: State<Int> = _counter

    fun onCounterClick() {
        _counter.value++
    }
}