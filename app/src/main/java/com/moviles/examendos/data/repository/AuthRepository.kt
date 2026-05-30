package com.moviles.examendos.data.repository

import com.moviles.examendos.data.MockAuthData
import com.moviles.examendos.data.remote.model.UserDto

class AuthRepository {

    fun login(
        email: String,
        password: String
    ): UserDto? {

        val user = MockAuthData.users.find {
            it.email.equals(email.trim(), true) &&
                    it.password == password
        }

        return user?.let {
            UserDto(
                id = "1",
                name = "Administrator",
                email = it.email
            )
        }
    }
}