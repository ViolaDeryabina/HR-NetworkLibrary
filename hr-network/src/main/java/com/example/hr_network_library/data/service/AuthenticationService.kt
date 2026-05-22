package com.example.hr_network_library.data.service

import com.example.hr_network_library.data.dto.auth.AuthRequest
import com.example.hr_network_library.data.dto.auth.AuthResponse
import com.example.hr_network_library.data.dto.profile.ProfileDto
import com.example.hr_network_library.data.dto.auth.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationService {
    @POST("collections/users/records")
    suspend fun register(@Body registerRequest: RegisterRequest): ProfileDto

    @POST("collections/users/auth-with-password")
    suspend fun authorization(@Body authRequest: AuthRequest): AuthResponse
}