package com.example.hr_network_library.domain.entities

import com.google.gson.annotations.SerializedName

data class VacancyEntities (
    @SerializedName("city")
    val city: String,
    @SerializedName("department")
    val department: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("employee")
    val employee: String,
    @SerializedName("experience")
    val experience: String,
    @SerializedName("id")
    val id: String?,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("position")
    val position: String,
    @SerializedName("public")
    val `public`: Boolean,
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("requirements")
    val requirements: String,
    @SerializedName("responsiblePerson")
    val responsiblePerson: String,
    @SerializedName("salaryRange")
    val salaryRange: String,
    @SerializedName("supportDocuments")
    val supportDocuments: List<String>,
    @SerializedName("technicalQuestions")
    val technicalQuestions: String,
    @SerializedName("termsOfEmployments")
    val termsOfEmployments: String,
    @SerializedName("testTask")
    val testTask: String,
    @SerializedName("title")
    val title: String,
)