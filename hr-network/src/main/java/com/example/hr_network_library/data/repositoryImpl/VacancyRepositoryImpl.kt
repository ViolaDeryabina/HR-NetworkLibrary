package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.result.ApiCallAdapter
import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.service.VacancyService
import com.example.hr_network_library.data.dto.vacancy.VacancyDto
import com.example.hr_network_library.data.dto.vacancy.VacancyResponse
import com.example.hr_network_library.domain.repository.VacancyRepository
import javax.inject.Inject

// Назначение: Реализация репозитория для работы с вакансиями
// Автор: Дерябина В.Н.
// Дата создания 20-05-2026
class VacancyRepositoryImpl @Inject constructor(private val api: VacancyService) :
    VacancyRepository {
    override suspend fun getListVacancy(token: String): NetworkResult<VacancyResponse> {
        return ApiCallAdapter.safeApiCall { api.getListVacancy(token) }
    }

    override suspend fun getVacancyById(
        token: String,
        id: String
    ): NetworkResult<VacancyDto> {
        return ApiCallAdapter.safeApiCall { api.getVacancyById("Bearer $token", id) }
    }

    override suspend fun createVacancy(
        token: String,
        vacancyDto: VacancyDto
    ): NetworkResult<VacancyDto> {
        return ApiCallAdapter.safeApiCall { api.createVacancy("Bearer $token", vacancyDto) }
    }

    override suspend fun editVacancy(
        token: String,
        id: String,
        vacancyDto: VacancyDto
    ): NetworkResult<VacancyDto> {
        return ApiCallAdapter.safeApiCall { api.editVacancy("Bearer $token", id, vacancyDto) }
    }

    override suspend fun deleteVacancy(token: String, id: String): NetworkResult<Unit> {
        return ApiCallAdapter.safeApiCall { api.deleteVacancy("Bearer $token", id) }
    }
}