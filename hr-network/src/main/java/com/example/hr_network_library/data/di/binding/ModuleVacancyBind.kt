package com.example.hr_network_library.data.module

import com.example.hr_network_library.data.repositoryImpl.VacancyRepositoryImpl
import com.example.hr_network_library.domain.repository.VacancyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleVacancyBind {

    @Binds
    @Singleton
    abstract fun vacancyBind(vacancyRepositoryImpl: VacancyRepositoryImpl): VacancyRepository
}