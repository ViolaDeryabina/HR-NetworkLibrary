package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.auth.AuthResponse

interface ProfileRepository {
    suspend fun getProfileByToken(token: String): NetworkResult<AuthResponse>

}