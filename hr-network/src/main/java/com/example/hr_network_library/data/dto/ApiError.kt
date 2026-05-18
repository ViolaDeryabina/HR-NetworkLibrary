package com.example.hr_network_library.data.dto

// Назначение: Модель данных для ошибок
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026

data class ApiError(
    val status: Int,
    val message: String?
)
