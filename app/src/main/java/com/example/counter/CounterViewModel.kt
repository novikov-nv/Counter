package com.example.counter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(private val repository: CounterRepository) : ViewModel() {
    private val _count = mutableStateOf(0)
// Expose the count as an immutable state
    val count: MutableState<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}