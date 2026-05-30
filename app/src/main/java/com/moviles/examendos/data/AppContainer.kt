package com.moviles.examendos.data

import com.moviles.examendos.data.repository.AuthRepository

object AppContainer {
    object AppContainer {

        val authRepository =
            AuthRepository()
    }
}