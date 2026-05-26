package com.example.hr_network_library.data.service

import com.example.hr_network_library.data.dto.auth.AuthRequest
import com.example.hr_network_library.data.dto.auth.AuthResponse
import com.example.hr_network_library.data.dto.profile.ProfileDto
import com.example.hr_network_library.data.dto.auth.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST

// Назначение: Интерфейс для взаимодействия с API для регистрации и входа
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
interface AuthenticationService {
    @POST("collections/users/records")
    suspend fun register(@Body registerRequest: RegisterRequest): ProfileDto

    @POST("collections/users/auth-with-password")
    suspend fun authorization(@Body authRequest: AuthRequest): AuthResponse
}