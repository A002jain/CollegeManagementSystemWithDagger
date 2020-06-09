package com.cms.service;

import com.cms.repository.ICmsRepository;
import com.cms.validator.ICmsValidator;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CmsService_Factory implements Factory<CmsService> {
  private final Provider<ICmsRepository> repositoryProvider;

  private final Provider<ICmsValidator> validatorProvider;

  public CmsService_Factory(Provider<ICmsRepository> repositoryProvider,
      Provider<ICmsValidator> validatorProvider) {
    this.repositoryProvider = repositoryProvider;
    this.validatorProvider = validatorProvider;
  }

  @Override
  public CmsService get() {
    return newInstance(repositoryProvider.get(), validatorProvider.get());
  }

  public static CmsService_Factory create(Provider<ICmsRepository> repositoryProvider,
      Provider<ICmsValidator> validatorProvider) {
    return new CmsService_Factory(repositoryProvider, validatorProvider);
  }

  public static CmsService newInstance(ICmsRepository repository, ICmsValidator validator) {
    return new CmsService(repository, validator);
  }
}
