package com.example.decompose.data.use_case;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/decompose/data/use_case/GetCoinsUseCaseImpl;", "Lcom/example/decompose/domain/use_case/GetCoinUseCase;", "repository", "Lcom/example/decompose/domain/repository/CoinRepository;", "application", "Landroid/app/Application;", "(Lcom/example/decompose/domain/repository/CoinRepository;Landroid/app/Application;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/decompose/domain/util/Resource;", "", "Lcom/example/decompose/domain/model/Coin;", "data_debug"})
public final class GetCoinsUseCaseImpl implements com.example.decompose.domain.use_case.GetCoinUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.decompose.domain.repository.CoinRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.Application application = null;
    
    @javax.inject.Inject
    public GetCoinsUseCaseImpl(@org.jetbrains.annotations.NotNull
    com.example.decompose.domain.repository.CoinRepository repository, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.example.decompose.domain.util.Resource<java.util.List<com.example.decompose.domain.model.Coin>>> invoke() {
        return null;
    }
}