package com.example.hr_network_library.data.service

import com.example.hr_network_library.data.dto.comment.Comment
import retrofit2.http.GET
import retrofit2.http.Header

// Назначение: Интерфейс для взаимодействия с API для работы с Hiring
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
interface HiringService {
    @GET("collections/departments/records")
    suspend fun getListDepartment(@Header("Authorization") token: String): Comment

    @GET("collections/positions/records")
    suspend fun getListPositions(@Header("Authorization") token: String): Comment

    @GET("collections/candidateStatuses/records")
    suspend fun getListCandidateStatuses(@Header("Authorization") token: String): Comment

}