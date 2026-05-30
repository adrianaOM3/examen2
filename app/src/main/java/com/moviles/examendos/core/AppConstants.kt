package com.moviles.examendos.core

object AppConstants {
    const val FCM_LOG_TAG = "FCM"

    object Api {
        /** Emulator reaches host machine at 10.0.2.2; change port to match your API. */
        const val BASE_URL = "http://10.0.2.2:5147/"
        object Paths {
            const val AUTH_LOGIN = "api/auth/login"
        }
    }
}