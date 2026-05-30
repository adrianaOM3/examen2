package com.moviles.examendos.data

import com.moviles.examendos.data.remote.model.LoginRequest

object MockAuthData {
    val users = listOf(
        LoginRequest(
            email = "admin@panini.com",
            password = "admin123456"
        ),
        LoginRequest(
            email = "support@panini.com",
            password = "support123"
        ),
        LoginRequest(
            email = "logistics@panini.com",
            password = "logistics123"
        )
    )
}

