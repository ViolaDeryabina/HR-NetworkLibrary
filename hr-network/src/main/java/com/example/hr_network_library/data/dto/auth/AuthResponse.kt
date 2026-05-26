package com.example.hr_network_library.data.dto.auth

import com.example.hr_network_library.data.dto.profile.ProfileDto

// Назначение: Класс для получения данных при авторизации
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class AuthResponse(
    val token: String,
    val record: ProfileDto
)
