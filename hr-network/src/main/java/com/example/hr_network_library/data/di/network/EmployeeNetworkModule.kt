package com.example.hr_network_library.data.di.network

import com.example.hr_network_library.data.service.EmployeeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

// Назначение: Модуль для предоставления EmployeeService
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026
@Module
@InstallIn(SingletonComponent::class)
object EmployeeNetworkModule {
    @Provides
    @Singleton
    fun provideEmployee(retrofit: Retrofit): EmployeeService =
        retrofit.create(EmployeeService::class.java)
}