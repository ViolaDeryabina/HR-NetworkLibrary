package com.example.hr_network_library.data.di.network

import com.example.hr_network_library.data.service.VacancyService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

// Назначение: Модуль для предоставления VacancyService
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026
@Module
@InstallIn(SingletonComponent::class)
object VacancyNetworkModule {
    @Provides
    @Singleton
    fun provideVacancy(retrofit: Retrofit): VacancyService =
        retrofit.create(VacancyService::class.java)
}