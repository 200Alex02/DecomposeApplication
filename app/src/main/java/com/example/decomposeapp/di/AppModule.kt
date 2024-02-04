package com.example.decomposeapp.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /*@Provides
    @Singleton
    fun provideRealRootBottomComponent(getCoinsUseCase: GetCoinsUseCaseImpl, getCoinUseCaseById: GetCoinUseCaseByIdImpl, componentContext: ComponentContext): RealRootBottomComponent {
        return RealRootBottomComponent(getCoinsUseCase, getCoinUseCaseById, componentContext)
    }*/
}
