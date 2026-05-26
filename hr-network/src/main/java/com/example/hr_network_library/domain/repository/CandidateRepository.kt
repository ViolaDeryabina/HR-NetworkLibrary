package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.comment.Comment
import com.example.hr_network_library.data.dto.candidate.Items

// Назначение: Репозиторий для получения информации о кандидатах
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
interface CandidateRepository {
    suspend fun getListCandidate(
        token: String, expand: String
    ): NetworkResult<Items>

    suspend fun getComments(
        token: String, filter: String
    ): NetworkResult<Comment>
}