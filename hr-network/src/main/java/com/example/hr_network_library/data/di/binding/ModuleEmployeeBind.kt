package com.example.hr_network_library.data.di.binding

import com.example.hr_network_library.data.repositoryImpl.EmployeeRepositoryImpl
import com.example.hr_network_library.domain.repository.EmployeeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Назначение: Создание связи между репозиторием и реализацией Employee
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleEmployeeBind {

    @Binds
    @Singleton
    abstract fun employeeBind(employeeRepository: EmployeeRepositoryImpl): EmployeeRepository
}