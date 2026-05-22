package com.example.hr_network_library.data.service

import com.example.hr_network_library.data.dto.auth.AuthResponse
import retrofit2.http.Header
import retrofit2.http.POST

interface ProfileService {
    @POST("collections/users/auth-refresh")
    suspend fun getProfileByToken(@Header("Authorization") token: String): AuthResponse
}