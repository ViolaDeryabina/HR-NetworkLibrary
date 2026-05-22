package com.example.hr_network_library.data.di

import com.example.hr_network_library.data.service.HiringService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

// Назначение: Модуль для предоставления HiringService
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026
@Module
@InstallIn(SingletonComponent::class)
object HiringNetworkModule {
    @Provides
    @Singleton
    fun provideHiring(retrofit: Retrofit): HiringService =
        retrofit.create(HiringService::class.java)
}