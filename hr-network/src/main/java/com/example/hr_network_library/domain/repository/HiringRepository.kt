package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.dataSources.NetworkResult
import com.example.hr_network_library.data.dto.Comment
import retrofit2.http.GET
import retrofit2.http.Header

interface HiringRepository {
    suspend fun getListDepartment(token: String): NetworkResult<Comment>

    suspend fun getListPositions(token: String): NetworkResult<Comment>

    suspend fun getListCandidateStatuses(token: String): NetworkResult<Comment>
}