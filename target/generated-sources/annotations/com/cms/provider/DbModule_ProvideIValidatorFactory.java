package com.cms.provider;

import com.cms.validator.ICmsValidator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DbModule_ProvideIValidatorFactory implements Factory<ICmsValidator> {
  private final DbModule module;

  public DbModule_ProvideIValidatorFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public ICmsValidator get() {
    return provideIValidator(module);
  }

  public static DbModule_ProvideIValidatorFactory create(DbModule module) {
    return new DbModule_ProvideIValidatorFactory(module);
  }

  public static ICmsValidator provideIValidator(DbModule instance) {
    return Preconditions.checkNotNull(instance.provideIValidator(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
