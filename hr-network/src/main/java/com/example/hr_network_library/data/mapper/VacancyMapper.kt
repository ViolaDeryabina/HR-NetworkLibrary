package com.example.hr_network_library.data.mapper

import com.example.hr_network_library.data.dto.vacancy.VacancyDto
import com.example.hr_network_library.domain.entities.VacancyEntities

// Назначение: Функция для преобразования из DTO в Entities
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
fun VacancyDto.toDomain(): VacancyEntities {
    return VacancyEntities(
        city = this.city,
        department = this.department,
        description = this.description,
        email = this.email,
        employee = this.employee,
        experience = this.experience,
        id = this.id,
        phone = this.phone,
        position = this.position,
        public = this.public,
        quantity = this.quantity,
        requirements = this.requirements,
        responsiblePerson = this.responsiblePerson,
        salaryRange = this.salaryRange,
        supportDocuments = this.supportDocuments,
        technicalQuestions = this.city,
        termsOfEmployments = this.termsOfEmployments,
        testTask = this.testTask,
        title = this.title,
    )
}