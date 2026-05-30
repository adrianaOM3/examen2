package com.moviles.examendos.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moviles.examendos.data.remote.model.TicketDto

@Composable
fun TicketCard(
    ticket: TicketDto,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(ticket.title)

            Text("Priority: ${ticket.priority}")

            Text("Status: ${ticket.status}")

            Text("Category: ${ticket.category}")

            Text(ticket.createdAt)
        }
    }
}