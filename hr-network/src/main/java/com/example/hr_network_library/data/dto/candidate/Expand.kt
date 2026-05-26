package com.example.hr_network_library.data.dto.candidate

import com.example.hr_network_library.data.dto.vacancy.VacancyDto
import com.google.gson.annotations.SerializedName

// Назначение: Класс получения данных о кандидатах и вакансиях
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class Expand(
    @SerializedName("candidate")
    val candidate: Candidate,
    @SerializedName("vacancy")
    val vacancy: VacancyDto
)