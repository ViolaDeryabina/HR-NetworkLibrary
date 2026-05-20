package com.example.hr_network_library.data.dataSources.service

import com.example.hr_network_library.data.dto.AuthResponse
import retrofit2.http.Header
import retrofit2.http.POST

interface ProfileService {
    @POST("collections/users/auth-refresh")
    suspend fun getProfileByToken(@Header("Authorization") token: String): AuthResponse
}