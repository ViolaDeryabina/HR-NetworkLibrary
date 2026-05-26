package com.example.hr_network_library.data.dto.auth

// Назначение: Класс для отправки данных для авторизации
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class AuthRequest(
    val identity: String,
    val password: String
)
