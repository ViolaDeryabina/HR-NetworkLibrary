package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.dataSources.NetworkResult
import com.example.hr_network_library.data.dto.AuthRequest
import com.example.hr_network_library.data.dto.AuthResponse
import com.example.hr_network_library.data.dto.ProfileDto
import com.example.hr_network_library.data.dto.RegisterRequest

interface AuthenticationRepository {
    suspend fun register(registerRequest: RegisterRequest): NetworkResult<ProfileDto>
    suspend fun authorization( authRequest: AuthRequest):  NetworkResult<AuthResponse>

}