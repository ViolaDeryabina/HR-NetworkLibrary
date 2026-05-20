package com.example.hr_network_library.domain.entities

import com.google.gson.annotations.SerializedName

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
