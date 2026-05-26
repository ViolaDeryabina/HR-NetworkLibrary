package com.example.hr_network_library.domain.entities

import com.google.gson.annotations.SerializedName

// Назначение: Entities для работы с профилем пользователя
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class Profile(
    @SerializedName("avatar")
    val avatar: String?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("firstName")
    val firstName: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("lastName")
    val lastName: String?
)
