package com.example.hr_network_library.data.di.network

import com.example.hr_network_library.data.service.CandidateService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

// Назначение: Модуль для предоставления CandidateService
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026
@Module
@InstallIn(SingletonComponent::class)
object CandidateNetworkModule {
    @Provides
    @Singleton
    fun provideCandidate(retrofit: Retrofit): CandidateService =
        retrofit.create(CandidateService::class.java)
}