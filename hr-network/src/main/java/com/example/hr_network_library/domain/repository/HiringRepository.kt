package com.example.hr_network_library.domain.repository

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.comment.Comment

// Назначение: Репозиторий для получения информации о Hiring
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
interface HiringRepository {
    suspend fun getListDepartment(token: String): NetworkResult<Comment>

    suspend fun getListPositions(token: String): NetworkResult<Comment>

    suspend fun getListCandidateStatuses(token: String): NetworkResult<Comment>
}