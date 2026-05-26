package com.example.hr_network_library

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.hr_network_library.data.dto.auth.RegisterRequest
import com.example.hr_network_library.data.repositoryImpl.AuthenticationRepositoryImpl
import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.service.AuthenticationService
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runTest
import okhttp3.mockwebserver.MockResponse
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

// Назначение: Интеграционный тест для проверки работы регистрации
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@RunWith(AndroidJUnit4::class)
class AuthIntegrationTest {
    @get:Rule
    val serverRule = ServerTestRule()

    val authenticationService: AuthenticationService =
        serverRule.retrofit.create(AuthenticationService::class.java)
    val authenticationRepository = AuthenticationRepositoryImpl(authenticationService)

    @Test
    fun `register successful`() = runTest {
        serverRule.mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(File("src/test/assets/register_success.json").readText())
        )
        val result = authenticationRepository.register(
            RegisterRequest(
                firstName = "Иван",
                lastName = "Иванов",
                email = "ivan@example.com",
                password = "password123",
                passwordConfirm = "password123"
            )
        )

        val request = serverRule.mockWebServer.takeRequest()
        assertEquals("/collections/users/records", request.path)
        assertEquals("POST", request.method)
        assertEquals("application/json; charset=UTF-8", request.getHeader("Content-Type"))

        assertTrue(result is NetworkResult.Success)
        val profile = (result as NetworkResult.Success).data
        assertEquals("123", profile.id)
        assertEquals("Иван", profile.firstName)
        assertEquals("Иванов", profile.lastName)
        assertEquals("ivan@example.com", profile.email)
    }
}