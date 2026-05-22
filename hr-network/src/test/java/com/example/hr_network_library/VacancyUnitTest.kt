package com.example.hr_network_library

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.dto.vacancy.VacancyDto
import com.example.hr_network_library.data.repositoryImpl.VacancyRepositoryImpl
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

@HiltAndroidTest
@Config(application = HiltTestApplication::class)
@RunWith(RobolectricTestRunner::class)
class VacancyUnitTest : BasicUnitTest() {

    @Inject
    lateinit var vacancyRepository: VacancyRepositoryImpl

    @Test
    fun getListVacUnitTest() = runTest {
        val email = createUser()
        val token = authUser().token

        val result = vacancyRepository.getListVacancy(token)
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data
    }

    @Test
    fun getVacancyById() = runTest {
        val email = createUser()
        val token = authUser().token

        val result = vacancyRepository.getVacancyById(token, "vo7uoj20fhes7yo")
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data

        assertEquals("vo7uoj20fhes7yo", data.id)

    }

    @Test
    fun updateVacancyById() = runTest {
        val email = createUser()
        val token = authUser().token

        val result = vacancyRepository.createVacancy(token, VacancyDto(
            title = "test",
            department = "oukr3z5yzgw65go",
            openingDate = "2022-01-01T10:00:00.123Z",
            position = "85tk3cwzv1obu9w",
            salaryRange = "test",
            quantity = 123,
            experience = "test",
            city = "test",
            public = true,
            description = "test",
            termsOfEmployments = "test",
            requirements = "test",
            technicalQuestions = "test",
            testTask = "test",
            supportDocuments = emptyList(),
            employee = "e4xaa41jihyipvz",
            phone = "test",
            email = email,
            responsiblePerson = "e4xaa41jihyipvz",
            created = "2022-01-01T10:00:00.123Z",
            updated = "2022-01-01T10:00:00.123Z"
        ))
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data

        //assertEquals("vo7uoj20fhes7yo", data.id)
        assertEquals("test", data.title)

    }

    @Test
    fun createVacancy() = runTest {
        val email = createUser()
        val token = authUser().token

        val result = vacancyRepository.createVacancy(
            token, VacancyDto(
                city = "qwerty",
                created = "qwerty",
                department = "qwerty",
                description = "qwerty",
                email = email,
                employee = "qwerty",
                experience = "qwerty",
                id = "qwerty",
                openingDate = "qwerty",
                phone = "qwerty",
                position = "qwerty",
                public = true,
                quantity = 2,
                requirements = "qwerty",
                responsiblePerson = "qwerty",
                salaryRange = "qwerty",
                supportDocuments = listOf("qwerty"),
                technicalQuestions = "qwerty",
                termsOfEmployments = "qwerty",
                testTask = "qwerty",
                title = "qwerty",
                updated = "qwerty",
            )
        )
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data

        assertEquals(email, data.email)
    }
}