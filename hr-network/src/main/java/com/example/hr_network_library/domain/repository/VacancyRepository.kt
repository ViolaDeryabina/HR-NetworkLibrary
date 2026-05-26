package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.vacancy.VacancyDto
import com.example.hr_network_library.data.dto.vacancy.VacancyResponse

// Назначение: Репозиторий для работы с вакансиями
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
interface VacancyRepository {
    suspend fun getListVacancy(token: String): NetworkResult<VacancyResponse>
    suspend fun getVacancyById(token: String, id: String): NetworkResult<VacancyDto>

    suspend fun createVacancy(token: String, vacancyDto: VacancyDto): NetworkResult<VacancyDto>

    suspend fun editVacancy(
        token: String, id: String, vacancyDto: VacancyDto
    ): NetworkResult<VacancyDto>

    suspend fun deleteVacancy(token: String, id: String): NetworkResult<Unit>


}