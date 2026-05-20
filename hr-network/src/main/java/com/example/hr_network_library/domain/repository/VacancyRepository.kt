package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.dataSources.NetworkResult
import com.example.hr_network_library.data.dto.VacancyDto

interface VacancyRepository {
    suspend fun getListVacancy(token: String): NetworkResult<VacancyDto>
    suspend fun getVacancyById(token: String, id: String): NetworkResult<VacancyDto>

    suspend fun createVacancy(token: String, vacancyDto: VacancyDto): NetworkResult<VacancyDto>

    suspend fun editVacancy(
        token: String, id: String, vacancyDto: VacancyDto
    ): NetworkResult<VacancyDto>

    suspend fun deleteVacancy(token: String, id: String): NetworkResult<Unit>


}