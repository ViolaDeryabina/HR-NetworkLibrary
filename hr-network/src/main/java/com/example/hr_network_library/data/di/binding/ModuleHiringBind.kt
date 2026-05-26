package com.example.hr_network_library.data.di.binding

import com.example.hr_network_library.data.repositoryImpl.HiringRepositoryImpl
import com.example.hr_network_library.domain.repository.HiringRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Назначение: Создание связи между репозиторием и реализацией Hiring
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleHiringBind {

    @Binds
    @Singleton
    abstract fun moduleHiringBind(hiringRepositoryImpl: HiringRepositoryImpl): HiringRepository
}