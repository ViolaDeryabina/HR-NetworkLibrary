package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.result.ApiCallAdapter
import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.result.map
import com.example.hr_network_library.data.service.AuthenticationService
import com.example.hr_network_library.data.dto.auth.AuthRequest
import com.example.hr_network_library.data.dto.auth.AuthResponse
import com.example.hr_network_library.data.dto.auth.RegisterRequest
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