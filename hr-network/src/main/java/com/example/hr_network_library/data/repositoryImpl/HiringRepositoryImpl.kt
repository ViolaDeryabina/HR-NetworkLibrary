package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.result.ApiCallAdapter
import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.service.HiringService
import com.example.hr_network_library.data.dto.comment.Comment
import com.example.hr_network_library.domain.repository.HiringRepository
import javax.inject.Inject

class HiringRepositoryImpl @Inject constructor (private val api: HiringService) : HiringRepository {
    override suspend fun getListDepartment(token: String): NetworkResult<Comment> {
        return ApiCallAdapter.safeApiCall { api.getListDepartment("Bearer $token") }
    }

    override suspend fun getListPositions(token: String): NetworkResult<Comment> {
        return ApiCallAdapter.safeApiCall { api.getListPositions("Bearer $token") }
    }

    override suspend fun getListCandidateStatuses(token: String): NetworkResult<Comment> {
        return ApiCallAdapter.safeApiCall { api.getListCandidateStatuses("Bearer $token") }
    }
}