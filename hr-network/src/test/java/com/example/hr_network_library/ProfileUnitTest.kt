package com.example.hr_network_library

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.repositoryImpl.ProfileRepositoryImpl
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

// Назначение: Интеграционный тест для проверки работы profileRepository с запросом к реальному серверу
// Автор: Дерябина В.Н.
// Дата создания: 26-05-2026
@HiltAndroidTest
@Config(application = HiltTestApplication::class)
class ProfileUnitTest : BasicUnitTest() {

    @Inject
    lateinit var profileRepository: ProfileRepositoryImpl

    @Test
    fun getProfileByToken() = runTest {
        val email = createUser()
        val token = authUser().token

        val result = profileRepository.getProfileByToken(
            token
        )

        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data

        assertEquals(token, data.token)
        assertEquals(email, data.record.email)
        assertEquals("Иван", data.record.firstName)
        assertEquals("Иванов", data.record.lastName)
    }
}