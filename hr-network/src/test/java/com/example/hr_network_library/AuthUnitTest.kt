package com.example.hr_network_library

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.auth.AuthRequest
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@HiltAndroidTest
@Config(application = HiltTestApplication::class)
@RunWith(RobolectricTestRunner::class)
class AuthUnitTest : BasicUnitTest() {

    @Test
    fun authUserTest() = runTest {
        val email = createUser()
        val token = authUser()

        val request = AuthRequest(
            identity = email,
            password = "123456789"
        )
        val result = authenticationRepository.authorization(
            request
        )

        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data

        assertEquals(email, data.record.email)
        assertEquals("Иван", data.record.firstName)
        assertEquals("Иванов", data.record.lastName)
    }
}