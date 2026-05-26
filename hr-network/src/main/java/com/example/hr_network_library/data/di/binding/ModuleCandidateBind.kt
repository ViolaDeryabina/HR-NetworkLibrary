package com.example.hr_network_library.data.di.binding

import com.example.hr_network_library.data.repositoryImpl.CandidateRepositoryImpl
import com.example.hr_network_library.domain.repository.CandidateRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Назначение: Создание связи между репозиторием и реализауией Кандидатов
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleCandidateBind {

    @Binds
    @Singleton
    abstract fun candidateBind(candidateRepositoryImpl: CandidateRepositoryImpl): CandidateRepository
}