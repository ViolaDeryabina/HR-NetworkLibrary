package com.example.hr_network_library.data.dataSources

import com.example.hr_network_library.common.logDebug
import com.example.hr_network_library.data.dataSources.service.AuthenticationService
import com.example.hr_network_library.data.dataSources.service.CandidateService
import com.example.hr_network_library.data.dataSources.service.EmployeeService
import com.example.hr_network_library.data.dataSources.service.HiringService
import com.example.hr_network_library.data.dataSources.service.ProfileService
import com.example.hr_network_library.data.dataSources.service.VacancyService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

// Назначение: Модуль для подключения к API
// Автор: Дерябина В.Н.
// Дата создания 18-05-2026

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val BASE_URL = "http://10.207.106.59:8090/api/"

    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor { message ->
        logDebug("NetworkModule", "Подключение", message)
    }.apply {
        level = HttpLoggingInterceptor.Level.BODY
    }


    @Provides
    @Singleton
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun provideAuth(retrofit: Retrofit): AuthenticationService =
        retrofit.create(AuthenticationService::class.java)

    @Provides
    @Singleton
    fun provideProfile(retrofit: Retrofit): ProfileService =
        retrofit.create(ProfileService::class.java)

    @Provides
    @Singleton
    fun provideCandidate(retrofit: Retrofit): CandidateService =
        retrofit.create(CandidateService::class.java)

    @Provides
    @Singleton
    fun provideEmployee(retrofit: Retrofit): EmployeeService =
        retrofit.create(EmployeeService::class.java)


    @Provides
    @Singleton
    fun provideVacancy(retrofit: Retrofit): VacancyService =
        retrofit.create(VacancyService::class.java)

    @Provides
    @Singleton
    fun provideHiring(retrofit: Retrofit): HiringService =
        retrofit.create(HiringService::class.java)
}