package com.example.hr_network_library.data.mapper

import com.example.hr_network_library.data.dto.VacancyDto
import com.example.hr_network_library.domain.entities.VacancyEntities

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