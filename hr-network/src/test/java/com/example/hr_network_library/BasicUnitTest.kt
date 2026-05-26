package com.example.hr_network_library

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.auth.AuthRequest
import com.example.hr_network_library.data.dto.auth.AuthResponse
import com.example.hr_network_library.data.dto.auth.RegisterRequest
import com.example.hr_network_library.data.repositoryImpl.AuthenticationRepositoryImpl
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

// Назначение: Общий класс для создания функций для работы тестов к реальному серверу
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@HiltAndroidTest
@Config(application = HiltTestApplication::class)
@RunWith(RobolectricTestRunner::class)
open class BasicUnitTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var authenticationRepository: AuthenticationRepositoryImpl

    private var email = ""

    @Before
    fun start() {
        hiltRule.inject()
    }
    suspend fun createUser(): String {
        email = "test_${System.currentTimeMillis()}@gmail.com"
        val request = RegisterRequest(
            passwordConfirm = "123456789",
            email = email,
            firstName = "Иван",
            lastName = "Иванов",
            password = "123456789"
        )
        val result = authenticationRepository.register(request)

        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data

        assertEquals("Иван", data.firstName)
        assertEquals("Иванов", data.lastName)
        return email
    }

    suspend fun authUser(): AuthResponse {
        val request = AuthRequest(
            identity = email,
            password = "123456789"
        )
        val result = authenticationRepository.authorization(
            request
        )

        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data
        return data
    }
}