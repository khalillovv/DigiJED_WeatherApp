package com.example.a01.dependency_injection

import com.example.a01.network.repository.WeatherDataRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { WeatherDataRepository(weatherApi = get()) }
}