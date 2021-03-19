package com.example.marsroverphotos.di

import com.example.marsroverphotos.data.source.RoverRepository
import com.example.marsroverphotos.data.source.RoverRepositoryImpl
import dagger.Binds
import dagger.Module
import org.junit.Assert.*

@Module
abstract class RepositoryModuleTest {
    @Binds
    abstract fun providesRoverRepository( roverRepository: RoverRepositoryImpl): RoverRepository
}