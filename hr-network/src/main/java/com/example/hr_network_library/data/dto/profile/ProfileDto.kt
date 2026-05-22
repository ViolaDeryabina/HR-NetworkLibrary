package com.example.hr_network_library.data.dto.profile

import com.google.gson.annotations.SerializedName

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