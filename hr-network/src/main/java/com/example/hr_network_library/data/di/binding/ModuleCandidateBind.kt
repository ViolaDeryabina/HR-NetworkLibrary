package com.example.hr_network_library.data.module

import com.example.hr_network_library.data.repositoryImpl.CandidateRepositoryImpl
import com.example.hr_network_library.domain.repository.CandidateRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ModuleCandidateBind {

    @Binds
    @Singleton
    abstract fun candidateBind(candidateRepositoryImpl: CandidateRepositoryImpl): CandidateRepository
}