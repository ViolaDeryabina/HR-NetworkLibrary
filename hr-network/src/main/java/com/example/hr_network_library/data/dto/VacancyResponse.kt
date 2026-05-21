package com.example.hr_network_library.data.dto

data class VacancyResponse(
    val items: List<VacancyDto>,
    val page: Int,
    val perPage: Int,
    val totalItems: Int,
    val totalPages: Int
)
