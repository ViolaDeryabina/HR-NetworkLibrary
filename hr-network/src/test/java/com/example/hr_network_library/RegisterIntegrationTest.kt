package com.example.hr_network_library

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.hr_network_library.data.dto.auth.AuthRequest
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

// Назначение: Интеграционный тест для проверки работы входа
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@RunWith(AndroidJUnit4::class)
class RegisterIntegrationTest {
    @get:Rule
    val serverRule = ServerTestRule()

    val registerService: AuthenticationService =
        serverRule.retrofit.create(AuthenticationService::class.java)

    val repository = AuthenticationRepositoryImpl(registerService)

    @Test
    fun `auth successful`() = runTest {
        serverRule.mockWebServer
            .enqueue(MockResponse()
                .setResponseCode(200)
                .setBody(File("src/test/assets/auth_success.json").readText()))

        val result = repository.authorization(
            AuthRequest(
                identity = "test@test.com",
                password = "123456789"
            )
        )

        val request = serverRule.mockWebServer.takeRequest()
        assertEquals("/collections/users/auth-with-password",request.path)
        assertEquals("POST",request.method)
        assertEquals("application/json; charset=UTF-8",request.getHeader("Content-Type"))

        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data
        assertEquals("123",data.record.id)
        assertEquals("Ivanov",data.record.lastName)
        assertEquals("Ivan",data.record.firstName)
    }
}