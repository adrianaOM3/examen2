package com.moviles.examendos.ui.screens.tickets

import androidx.lifecycle.ViewModel
import com.moviles.examendos.data.MockTickets
import com.moviles.examendos.data.remote.model.TicketDto
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class TicketUiState(
    val tickets: List<TicketDto> = emptyList(),
    val isLoading: Boolean = false
)
class TicketViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(TicketUiState())
    val uiState = _uiState.asStateFlow()

    init {
        loadTickets()
    }

    private fun loadTickets() {
        _uiState.value = _uiState.value.copy(isLoading = true)

        // Simulation
        val mockTickets = MockTickets.tickets

        _uiState.value = TicketUiState(
            tickets = mockTickets,
            isLoading = false
        )
    }
}