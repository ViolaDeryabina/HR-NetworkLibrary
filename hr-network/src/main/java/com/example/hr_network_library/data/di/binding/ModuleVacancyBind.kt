package com.example.hr_network_library.data.di.binding

import com.example.hr_network_library.data.repositoryImpl.VacancyRepositoryImpl
import com.example.hr_network_library.domain.repository.VacancyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Назначение: Создание связи между репозиторием и реализацией для Вакансий
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleVacancyBind {

    @Binds
    @Singleton
    abstract fun vacancyBind(vacancyRepositoryImpl: VacancyRepositoryImpl): VacancyRepository
}