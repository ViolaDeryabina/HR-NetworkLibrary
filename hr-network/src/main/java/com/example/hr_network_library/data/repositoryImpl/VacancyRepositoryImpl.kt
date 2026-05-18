package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.dataSources.service.VacancyService
import com.example.hr_network_library.domain.repository.VacancyRepository
import javax.inject.Inject

class VacancyRepositoryImpl @Inject constructor(private val api: VacancyService) :
    VacancyRepository {
}