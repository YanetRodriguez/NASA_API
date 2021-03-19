package com.example.marsroverphotos.data.source

import com.example.marsroverphotos.data.Result
import com.example.marsroverphotos.data.source.local.LocalRoverDataSource
import com.example.marsroverphotos.data.source.remote.RoverImageService
import com.example.marsroverphotos.data.source.remote.RoverServiceImpl
import com.example.marsroverphotos.models.RoverData
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import retrofit2.Response
import javax.inject.Inject

@HiltAndroidTest
class RoverRepositoryImplTest {

    @Inject
    lateinit var roverRepository: RoverRepository

    /*private var roverImageService: RoverImageService = object : RoverImageService {
        override suspend fun getImages(
            roverName: String,
            sol: String?,
            apiKey: String?,
            camera: String?,
            earthDate: String?,
            page: Int?
        ): Response<RoverData> {
            TODO("Not yet implemented")
        }

    }
    private lateinit var roverServiceImpl: RoverServiceImpl

    private lateinit var localRoverDataSource: LocalRoverDataSource

    // Class under test
    private lateinit var roverRepositoryImpl: RoverRepositoryImpl

    @Before
    fun createRepository() {
        roverServiceImpl = RoverServiceImpl(roverImageService)
        localRoverDataSource = LocalRoverDataSource()
        // Get a reference to the class under test
        roverRepositoryImpl = RoverRepositoryImpl(
            localRoverDataSource, roverServiceImpl
        )
    }*/

    @ExperimentalCoroutinesApi
    @Test
    suspend fun getRovers() {
        val rovers = roverRepository.getRovers()

        val success = rovers as Result.Success
        val data = success.data
        assertTrue(data.isNotEmpty())
    }

    /*@Test
    fun getAvailableCameras() {
    }

    @Test
    fun getImages() {
    }*/
}