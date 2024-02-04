package com.example.decompose.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/decompose/data/repository/CoinRepositoryImpl;", "Lcom/example/decompose/domain/repository/CoinRepository;", "api", "Lcom/example/decompose/data/remote/api/ApiService;", "(Lcom/example/decompose/data/remote/api/ApiService;)V", "getCoinById", "Lcom/example/decompose/domain/model/CoinDetail;", "coinId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoins", "", "Lcom/example/decompose/domain/model/Coin;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class CoinRepositoryImpl implements com.example.decompose.domain.repository.CoinRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.decompose.data.remote.api.ApiService api = null;
    
    @javax.inject.Inject
    public CoinRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.decompose.data.remote.api.ApiService api) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCoins(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.decompose.domain.model.Coin>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCoinById(@org.jetbrains.annotations.NotNull
    java.lang.String coinId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.decompose.domain.model.CoinDetail> $completion) {
        return null;
    }
}