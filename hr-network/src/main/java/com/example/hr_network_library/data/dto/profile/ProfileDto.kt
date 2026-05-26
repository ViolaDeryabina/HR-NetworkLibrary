package com.example.hr_network_library.data.dto.profile

import com.google.gson.annotations.SerializedName

// Назначение: Класс для получения данных о профиле
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class ProfileDto(
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("created")
    val created: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("updated")
    val updated: String
)