package com.example.hr_network_library

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.repositoryImpl.EmployeeRepositoryImpl
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
class EmployeeUnitTest: BasicUnitTest() {

    @Inject
    lateinit var employeeRepository: EmployeeRepositoryImpl

    @Test
    fun employeeUnitPositiveTest() = runTest{
        createUser()
        val dataUser = authUser()

        val result = employeeRepository.getListHR(dataUser.token)
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data

    }

    @Test
    fun employeeByIdUnitPositiveTest() = runTest{
        createUser()
        val dataUser = authUser()

        val result = employeeRepository.getHRById(dataUser.token, "e4xaa41jihyipvz")
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data

        assertEquals("e4xaa41jihyipvz",data.id)
    }
}