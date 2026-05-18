package com.example.hr_network_library.data.repositoryImpl

import com.example.hr_network_library.data.dataSources.service.ProfileService
import com.example.hr_network_library.domain.repository.ProfileRepository
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(private val api: ProfileService) :
    ProfileRepository {
}