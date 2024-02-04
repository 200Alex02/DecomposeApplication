// Generated by Dagger (https://dagger.dev).
package com.example.decompose.data.use_case;

import android.app.Application;
import com.example.decompose.domain.repository.CoinRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class GetCoinUseCaseByIdImpl_Factory implements Factory<GetCoinUseCaseByIdImpl> {
  private final Provider<CoinRepository> repositoryProvider;

  private final Provider<Application> applicationProvider;

  public GetCoinUseCaseByIdImpl_Factory(Provider<CoinRepository> repositoryProvider,
      Provider<Application> applicationProvider) {
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public GetCoinUseCaseByIdImpl get() {
    return newInstance(repositoryProvider.get(), applicationProvider.get());
  }

  public static GetCoinUseCaseByIdImpl_Factory create(Provider<CoinRepository> repositoryProvider,
      Provider<Application> applicationProvider) {
    return new GetCoinUseCaseByIdImpl_Factory(repositoryProvider, applicationProvider);
  }

  public static GetCoinUseCaseByIdImpl newInstance(CoinRepository repository,
      Application application) {
    return new GetCoinUseCaseByIdImpl(repository, application);
  }
}
