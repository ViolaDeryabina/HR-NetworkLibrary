package com.example.hr_network_library.data.dto.auth

import com.google.gson.annotations.SerializedName

// Назначение: Класс для отправки данных для регистрации
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
data class RegisterRequest(
    @SerializedName("passwordConfirm")
    val passwordConfirm: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("password")
    val password: String
)