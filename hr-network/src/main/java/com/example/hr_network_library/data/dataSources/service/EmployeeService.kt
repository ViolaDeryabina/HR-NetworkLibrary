package com.example.hr_network_library.data.dataSources.service

import com.example.hr_network_library.data.dto.candidate.EmployeeDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface EmployeeService {
    @GET("collections/employee/records")
    suspend fun getListHR(@Header("Authorization") token: String): EmployeeDto


    @GET("collections/employee/records/{id}")
    suspend fun getHRById(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): EmployeeDto

}