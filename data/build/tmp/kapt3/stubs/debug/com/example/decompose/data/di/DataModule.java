package com.example.decompose.data.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/decompose/data/di/DataModule;", "", "()V", "provideCoinRepository", "Lcom/example/decompose/data/repository/CoinRepositoryImpl;", "api", "Lcom/example/decompose/data/remote/api/ApiService;", "provideGetCoinUseCase", "Lcom/example/decompose/data/use_case/GetCoinsUseCaseImpl;", "repository", "application", "Landroid/app/Application;", "provideGetCoinUseCaseById", "Lcom/example/decompose/data/use_case/GetCoinUseCaseByIdImpl;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "providePaprikaApi", "data_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DataModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.decompose.data.di.DataModule INSTANCE = null;
    
    private DataModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.remote.api.ApiService providePaprikaApi() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.repository.CoinRepositoryImpl provideCoinRepository(@org.jetbrains.annotations.NotNull
    com.example.decompose.data.remote.api.ApiService api) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.use_case.GetCoinsUseCaseImpl provideGetCoinUseCase(@org.jetbrains.annotations.NotNull
    com.example.decompose.data.repository.CoinRepositoryImpl repository, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.decompose.data.use_case.GetCoinUseCaseByIdImpl provideGetCoinUseCaseById(@org.jetbrains.annotations.NotNull
    com.example.decompose.data.repository.CoinRepositoryImpl repository, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
}