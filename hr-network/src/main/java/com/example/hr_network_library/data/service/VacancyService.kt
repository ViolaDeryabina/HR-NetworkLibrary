package com.example.hr_network_library.data.service

import com.example.hr_network_library.data.dto.vacancy.VacancyDto
import com.example.hr_network_library.data.dto.vacancy.VacancyResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface VacancyService {
    @GET("collections/vacancy/records")
    suspend fun getListVacancy(@Header("Authorization") token: String): VacancyResponse

    @GET("collections/vacancy/records/{id}")
    suspend fun getVacancyById(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): VacancyDto

    @POST("collections/vacancy/records")
    suspend fun createVacancy(
        @Header("Authorization") token: String,
        @Body vacancyDto: VacancyDto
    ): VacancyDto

    @PATCH("collections/vacancy/records/{id}")
    suspend fun editVacancy(
        @Header("Authorization") token: String,
        @Path("id") id: String,
        @Body vacancyDto: VacancyDto
    ): VacancyDto

    @DELETE("collections/vacancy/records/{id}")
    suspend fun deleteVacancy(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): Unit


}