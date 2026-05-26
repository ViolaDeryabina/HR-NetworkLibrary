package com.example.hr_network_library.data.dto.vacancy


import com.google.gson.annotations.SerializedName
// Назначение: Класс для получения данных о вакансии
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class VacancyDto(
    @SerializedName("city")
    val city: String,
    @SerializedName("created")
    val created: String,
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
    val id: String? = null,
    @SerializedName("openingDate")
    val openingDate: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("position")
    val position: String,
    @SerializedName("public")
    val public: Boolean,
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
    @SerializedName("updated")
    val updated: String
)