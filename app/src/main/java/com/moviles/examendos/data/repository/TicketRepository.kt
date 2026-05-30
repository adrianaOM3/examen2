package com.moviles.examendos.data.repository

import com.moviles.examendos.data.MockTickets
import com.moviles.examendos.data.remote.model.TicketDto

class TicketRepository {

    fun getTickets(): List<TicketDto> {
        return MockTickets.tickets
    }

    fun getTicketById(
        ticketId: String
    ): TicketDto? {

        return MockTickets.tickets.find {
            it.id == ticketId
        }
    }

    fun createTicket(
        ticket: TicketDto
    ) {

        MockTickets.tickets.add(ticket)
    }

    fun updateStatus(
        ticketId: String,
        status: String
    ) {

        val index =
            MockTickets.tickets.indexOfFirst {
                it.id == ticketId
            }

        if (index != -1) {

            MockTickets.tickets[index] =
                MockTickets.tickets[index].copy(
                    status = status
                )
        }
    }
}