package com.example.hr_network_library.data.dto.auth

import com.example.hr_network_library.data.dto.profile.ProfileDto

data class AuthResponse(
    val token: String,
    val record: ProfileDto
)
