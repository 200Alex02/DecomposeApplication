package com.example.decomposeapp.di

import com.example.decomposeapp.common.Constants
import com.example.decomposeapp.data.remote.api.ApiService
import com.example.decomposeapp.data.repository.CoinRepositoryImpl
import com.example.decomposeapp.domain.repository.CoinRepository
import com.example.decomposeapp.domain.use_case.GetCoinUseCaseById
import com.example.decomposeapp.domain.use_case.GetCoinsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

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
    fun provideCoinRepository(api: ApiService): CoinRepository {
        return CoinRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideGetCoinUseCase(repository: CoinRepository): GetCoinsUseCase {
        return GetCoinsUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetCoinUseCaseById(repository: CoinRepository): GetCoinUseCaseById {
        return GetCoinUseCaseById(repository)
    }
}