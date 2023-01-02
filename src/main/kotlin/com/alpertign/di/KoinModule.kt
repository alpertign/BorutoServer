package com.alpertign.di

import com.alpertign.repository.HeroRepository
import com.alpertign.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single <HeroRepository> {
        HeroRepositoryImpl()
    }
}