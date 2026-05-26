package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.auth.AuthResponse

// Назначение: Репозиторий для получения информации о профиле пользователя
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
interface ProfileRepository {
    suspend fun getProfileByToken(token: String): NetworkResult<AuthResponse>

}