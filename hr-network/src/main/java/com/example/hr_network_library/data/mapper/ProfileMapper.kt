package com.example.hr_network_library.data.mapper

import com.example.hr_network_library.data.dto.ProfileDto
import com.example.hr_network_library.domain.entities.Profile

fun ProfileDto.toDomain(): Profile {
    return Profile(
        avatar = this.avatar,
        email = this.email,
        firstName = this.firstName,
        id = this.id,
        lastName = this.lastName
    )
}