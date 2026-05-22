package com.example.hr_network_library.data.service

import com.example.hr_network_library.data.dto.comment.Comment
import com.example.hr_network_library.data.dto.candidate.Items
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface CandidateService {
    @GET("collections/candidates/records")
    suspend fun getListCandidate(
        @Header("Authorization") token: String,
        @Query("expand") expand: String
    ): Items

    @GET("collections/comment/records")
    suspend fun getComments(
        @Header("Authorization") token: String,
        @Query("filter") filter: String
    ): Comment

}