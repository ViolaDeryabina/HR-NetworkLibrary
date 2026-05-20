package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.dataSources.NetworkResult
import com.example.hr_network_library.data.dto.AuthResponse

interface ProfileRepository {
    suspend fun getProfileByToken(token: String): NetworkResult<AuthResponse>

}