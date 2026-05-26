package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.auth.AuthRequest
import com.example.hr_network_library.data.dto.auth.AuthResponse
import com.example.hr_network_library.data.dto.auth.RegisterRequest
import com.example.hr_network_library.domain.entities.Profile

// Назначение: Репозиторий для аутетификации и регистрации
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
interface AuthenticationRepository {
    suspend fun register(registerRequest: RegisterRequest): NetworkResult<Profile>
    suspend fun authorization( authRequest: AuthRequest):  NetworkResult<AuthResponse>

}