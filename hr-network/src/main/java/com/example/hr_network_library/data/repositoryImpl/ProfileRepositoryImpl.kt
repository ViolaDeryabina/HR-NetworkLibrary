package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.dataSources.ApiCallAdapter
import com.example.hr_network_library.data.dataSources.NetworkResult
import com.example.hr_network_library.data.dataSources.service.ProfileService
import com.example.hr_network_library.data.dto.AuthResponse
import com.example.hr_network_library.domain.repository.ProfileRepository
import javax.inject.Inject

// Назначение: Реализация репозитория для получения информации по токену
// Автор: Дерябина В.Н.
// Дата создания 20-05-2026
class ProfileRepositoryImpl @Inject constructor(private val api: ProfileService) :
    ProfileRepository {
    override suspend fun getProfileByToken(token: String): NetworkResult<AuthResponse> {
        return ApiCallAdapter.safeApiCall { api.getProfileByToken("Bearer $token") }
    }
}