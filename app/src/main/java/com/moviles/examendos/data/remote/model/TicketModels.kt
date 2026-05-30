package com.moviles.examendos.data.remote.model

data class TicketDto(
    val id: String,
    val title: String,
    val description: String,
    val provider: String,
    val category: String,
    val priority: Priority,
    val status: String,
    val createdAt: String
)

