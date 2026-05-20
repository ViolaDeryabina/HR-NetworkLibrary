package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.dataSources.NetworkResult
import com.example.hr_network_library.data.dto.Comment
import com.example.hr_network_library.data.dto.candidate.Items

interface CandidateRepository {
    suspend fun getListCandidate(
        token: String, expand: String
    ): NetworkResult<Items>

    suspend fun getComments(
        token: String, filter: String
    ): NetworkResult<Comment>
}