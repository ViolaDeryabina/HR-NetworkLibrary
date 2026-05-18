package com.example.hr_network_library.data.dto

import com.google.gson.annotations.SerializedName

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
