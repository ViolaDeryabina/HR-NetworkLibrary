package com.example.hr_network_library.data.dto.vacancy

// Назначение: Класс для получения ответа от сервера
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class VacancyResponse(
    val items: List<VacancyDto>,
    val page: Int,
    val perPage: Int,
    val totalItems: Int,
    val totalPages: Int
)
