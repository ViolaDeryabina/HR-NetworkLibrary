package com.example.hr_network_library.data.dataSources.service

import com.example.hr_network_library.data.dto.AuthRequest
import com.example.hr_network_library.data.dto.AuthResponse
import com.example.hr_network_library.data.dto.ProfileDto
import com.example.hr_network_library.data.dto.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationService {
    @POST("collections/users/records")
    suspend fun register(@Body registerRequest: RegisterRequest): ProfileDto

    @POST("collections/users/auth-with-password")
    suspend fun authorization(@Body authRequest: AuthRequest): AuthResponse
}