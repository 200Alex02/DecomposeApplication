package com.example.decompose.data.di

import android.app.Application
import com.example.decompose.data.common.Constants
import com.example.decompose.data.remote.api.ApiService
import com.example.decompose.data.repository.CoinRepositoryImpl
import com.example.decompose.data.use_case.GetCoinUseCaseByIdImpl
import com.example.decompose.data.use_case.GetCoinsUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): ApiService {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: ApiService): CoinRepositoryImpl {
        return CoinRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideGetCoinUseCase(
        repository: CoinRepositoryImpl,
        application: Application
    ): GetCoinsUseCaseImpl {
        return GetCoinsUseCaseImpl(repository, application)
    }

    @Provides
    @Singleton
    fun provideGetCoinUseCaseById(
        repository: CoinRepositoryImpl,
        application: Application
    ): GetCoinUseCaseByIdImpl {
        return GetCoinUseCaseByIdImpl(repository, application)
    }
}