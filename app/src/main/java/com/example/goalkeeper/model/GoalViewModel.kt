package com.example.goalkeeper.model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

sealed class GoalIntent {
    object AddGoal : GoalIntent()
}
data class GoalState(
    val goals: List<String> = emptyList()
)
class GoalViewModel : ViewModel() {
    private val _state = MutableStateFlow(GoalState())
    val state: StateFlow<GoalState> get() = _state
    fun handleIntent(intent: GoalIntent) {
        when (intent) {
            is GoalIntent.AddGoal -> addGoal()
        }
    }

    private fun addGoal() {
        // TODO: Add logic to add a goal
    }
}