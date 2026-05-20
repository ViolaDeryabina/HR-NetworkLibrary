package com.example.hr_network_library.data.dataSources.service

import com.example.hr_network_library.data.dto.Comment
import retrofit2.http.GET
import retrofit2.http.Header

interface HiringService {
    @GET("collections/departments/records")
    suspend fun getListDepartment(@Header("Authorization") token: String): Comment

    @GET("collections/positions/records")
    suspend fun getListPositions(@Header("Authorization") token: String): Comment

    @GET("collections/candidateStatuses/records")
    suspend fun getListCandidateStatuses(@Header("Authorization") token: String): Comment

}