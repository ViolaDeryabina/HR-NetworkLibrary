package com.example.hr_network_library.data.mapper

import com.example.hr_network_library.data.dto.profile.ProfileDto
import com.example.hr_network_library.domain.entities.Profile

// Назначение: Функция для преобразования из DTO в Entities
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
fun ProfileDto.toDomain(): Profile {
    return Profile(
        avatar = this.avatar,
        email = this.email,
        firstName = this.firstName,
        id = this.id,
        lastName = this.lastName
    )
}