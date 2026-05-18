package com.example.hr_network_library.data.module

import com.example.hr_network_library.data.dataSources.service.ProfileService
import com.example.hr_network_library.data.repositoryImpl.ProfileRepositoryImpl
import com.example.hr_network_library.domain.repository.ProfileRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleProfileBind {

    @Binds
    @Singleton
    abstract fun profileBind(profileRepositoryImpl: ProfileRepositoryImpl): ProfileRepository
}