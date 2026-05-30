package com.moviles.examendos.data.remote

import com.moviles.examendos.core.AppConstants
import com.moviles.examendos.data.remote.model.LoginRequest
import com.moviles.examendos.data.remote.model.UserDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST(AppConstants.Api.Paths.AUTH_LOGIN)
    suspend fun login(@Body request: LoginRequest): Response<UserDto>
}