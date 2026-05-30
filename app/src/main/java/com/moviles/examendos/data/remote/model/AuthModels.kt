package com.moviles.examendos.data.remote.model

data class LoginRequest(
    val email: String,
    val password: String
)

data class UserDto(
    val id: String,
    val name: String,
    val email: String
)

data class MockUser(
    val id: String,
    val name: String,
    val email: String,
    val password: String
)
