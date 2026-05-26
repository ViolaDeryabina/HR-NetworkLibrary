package com.example.hr_network_library.data.di.binding

import com.example.hr_network_library.data.repositoryImpl.ProfileRepositoryImpl
import com.example.hr_network_library.domain.repository.ProfileRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Назначение: Создание связи между репозиторием и реализацией Профиля
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleProfileBind {

    @Binds
    @Singleton
    abstract fun profileBind(profileRepositoryImpl: ProfileRepositoryImpl): ProfileRepository
}