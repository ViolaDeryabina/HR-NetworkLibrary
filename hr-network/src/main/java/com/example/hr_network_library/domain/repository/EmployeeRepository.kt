package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.candidate.EmployeeDto

interface EmployeeRepository {
    suspend fun getListHR(token: String): NetworkResult<EmployeeDto>
    suspend fun getHRById(token: String, id: String): NetworkResult<EmployeeDto>
}