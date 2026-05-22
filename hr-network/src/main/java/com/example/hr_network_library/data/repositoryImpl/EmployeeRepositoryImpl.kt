package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.result.ApiCallAdapter
import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.service.EmployeeService
import com.example.hr_network_library.data.dto.candidate.EmployeeDto
import com.example.hr_network_library.domain.repository.EmployeeRepository
import javax.inject.Inject

// Назначение: Реализация репозитория для работы с HR-сотрудниками
// Автор: Дерябина В.Н.
// Дата создания 20-05-2026

class EmployeeRepositoryImpl @Inject constructor(private val api: EmployeeService) :
    EmployeeRepository {
    override suspend fun getListHR(token: String): NetworkResult<EmployeeDto> {
        return ApiCallAdapter.safeApiCall { api.getListHR("Bearer $token") }
    }

    override suspend fun getHRById(
        token: String,
        id: String
    ): NetworkResult<EmployeeDto> {
        return ApiCallAdapter.safeApiCall { api.getHRById("Bearer $token", id) }
    }

}