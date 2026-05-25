package com.example.hr_network_library

import com.example.hr_network_library.data.result.NetworkResult
import com.example.hr_network_library.data.repositoryImpl.HiringRepositoryImpl
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

@HiltAndroidTest
@Config(application = HiltTestApplication::class)
class HiringUnitTest: BasicUnitTest() {
    @Inject
    lateinit var hiringRepository: HiringRepositoryImpl

    @Test
    fun hiringUnitTestPositiveDepartments() = runTest{
        createUser()
        val dataUser = authUser()

        val result = hiringRepository.getListPositions(dataUser.token)
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data
    }

    @Test
    fun hiringUnitTestPositivePositions() = runTest{
        createUser()
        val dataUser = authUser()
        val result = hiringRepository.getListDepartment(dataUser.token)
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data
    }
    @Test
    fun hiringUnitTestPositiveCandidateStatuses() = runTest{
        createUser()
        val dataUser = authUser()

        val result = hiringRepository.getListCandidateStatuses(dataUser.token)
        assertTrue(result is NetworkResult.Success)
        val data = (result as NetworkResult.Success).data
    }
}