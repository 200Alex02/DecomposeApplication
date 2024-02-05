package com.example.decompose.domain.di

import android.app.Application
import com.example.decompose.domain.repository.CoinRepository
import com.example.decompose.domain.use_case.GetCoinUseCase
import com.example.decompose.domain.use_case.GetCoinUseCaseById
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {

    @Provides
    fun provideGetCoinUseCase(
        repository: CoinRepository,
        application: Application
    ): GetCoinUseCase {
        return GetCoinUseCase(repository, application)
    }

    @Provides
    fun getCoinUseCaseById(
        repository: CoinRepository,
        application: Application
    ): GetCoinUseCaseById {
        return GetCoinUseCaseById(repository, application)
    }
}