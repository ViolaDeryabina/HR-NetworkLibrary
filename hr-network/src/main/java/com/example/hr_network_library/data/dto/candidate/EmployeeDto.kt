package com.example.hr_network_library.data.dto.candidate


import com.google.gson.annotations.SerializedName

// Назначение: Класс получения данных о Employee
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class EmployeeDto(
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("created")
    val created: String,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("updated")
    val updated: String
)