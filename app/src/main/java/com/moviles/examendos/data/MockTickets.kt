package com.moviles.examendos.data

import com.moviles.examendos.data.remote.model.Priority
import com.moviles.examendos.data.remote.model.TicketDto
import com.moviles.examendos.data.remote.model.TicketStatus

object MockTickets {
        val tickets = mutableListOf(
            TicketDto(
                id = "T1",
                title = "Faltante de sobres",
                description = "No llegaron 50 cajas",
                provider = "Distribuidora Norte",
                category = "Inventario",
                priority = Priority.HIGH,
                status = "Open",
                createdAt = "30/05/2026"
            ),
            TicketDto(
                id = "T1",
                title = "Retraso en entrega",
                description = "El proveedor reporta un retraso de 48 horas en el envío.",
                provider = "Logística LATAM",
                category = "Logística",
                priority = Priority.CRITICAL,
                status =  "Open",
                createdAt = "28/05/2026"
            )
        )



}


