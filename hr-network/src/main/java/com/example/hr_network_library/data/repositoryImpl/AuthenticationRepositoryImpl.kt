package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.dataSources.ApiCallAdapter
import com.example.hr_network_library.data.dataSources.NetworkResult
import com.example.hr_network_library.data.dataSources.map
import com.example.hr_network_library.data.dataSources.service.AuthenticationService
import com.example.hr_network_library.data.dto.AuthRequest
import com.example.hr_network_library.data.dto.AuthResponse
import com.example.hr_network_library.data.dto.RegisterRequest
import com.example.hr_network_library.data.mapper.toDomain
import com.example.hr_network_library.domain.entities.Profile
import com.example.hr_network_library.domain.repository.AuthenticationRepository
import javax.inject.Inject

// Назначение: Реализация репозитория для входп и регистрации
// Автор: Дерябина В.Н.
// Дата создания 20-05-2026
class AuthenticationRepositoryImpl @Inject constructor(private val api: AuthenticationService) :
    AuthenticationRepository {
    override suspend fun register(registerRequest: RegisterRequest): NetworkResult<Profile> {
        return ApiCallAdapter.safeApiCall { api.register(registerRequest) }.map {
            it.toDomain()
        }
    }

    override suspend fun authorization(authRequest: AuthRequest): NetworkResult<AuthResponse> {
        return ApiCallAdapter.safeApiCall { api.authorization(authRequest) }
    }
}