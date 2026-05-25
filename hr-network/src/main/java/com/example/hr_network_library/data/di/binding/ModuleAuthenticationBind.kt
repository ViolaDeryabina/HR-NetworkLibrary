package com.example.hr_network_library.data.module

import com.example.hr_network_library.data.repositoryImpl.AuthenticationRepositoryImpl
import com.example.hr_network_library.domain.repository.AuthenticationRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleAuthenticationBind {

    @Binds
    @Singleton
    abstract fun authenticationBind(authenticationRepositoryImpl: AuthenticationRepositoryImpl): AuthenticationRepository
}