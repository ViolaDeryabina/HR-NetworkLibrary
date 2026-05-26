package com.example.hr_network_library.data.dto

// Назначение: Класс получения для ошибок
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026

data class ApiError(
    val status: Int,
    val message: String?
)
