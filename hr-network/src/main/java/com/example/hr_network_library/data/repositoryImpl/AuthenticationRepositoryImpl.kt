package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.dataSources.ApiCallAdapter
import com.example.hr_network_library.data.dataSources.NetworkResult
import com.example.hr_network_library.data.dataSources.service.AuthenticationService
import com.example.hr_network_library.data.dto.AuthRequest
import com.example.hr_network_library.data.dto.AuthResponse
import com.example.hr_network_library.data.dto.ProfileDto
import com.example.hr_network_library.data.dto.RegisterRequest
import com.example.hr_network_library.domain.repository.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(private val api: AuthenticationService) :
    AuthenticationRepository {
    override suspend fun register(registerRequest: RegisterRequest): NetworkResult<ProfileDto> {
        return ApiCallAdapter.safeApiCall { api.register(registerRequest) }
    }

    override suspend fun authorization(authRequest: AuthRequest): NetworkResult<AuthResponse> {
        return ApiCallAdapter.safeApiCall { api.authorization(authRequest) }
    }
}