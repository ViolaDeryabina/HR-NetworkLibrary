package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.result.ApiCallAdapter
import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.service.CandidateService
import com.example.hr_network_library.data.dto.comment.Comment
import com.example.hr_network_library.data.dto.candidate.Items
import com.example.hr_network_library.domain.repository.CandidateRepository
import javax.inject.Inject

class CandidateRepositoryImpl @Inject constructor(private val api: CandidateService) :
    CandidateRepository {
    override suspend fun getListCandidate(
        token: String,
        expand: String
    ): NetworkResult<Items> {
        return ApiCallAdapter.safeApiCall { api.getListCandidate("Bearer $token", expand) }
    }

    override suspend fun getComments(
        token: String,
        filter: String
    ): NetworkResult<Comment> {
        return ApiCallAdapter.safeApiCall { api.getComments("Bearer $token", filter) }
    }
}