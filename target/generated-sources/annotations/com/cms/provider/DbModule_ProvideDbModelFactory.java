package com.cms.provider;

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
public final class DbModule_ProvideDbModelFactory implements Factory<DbModel> {
  private final DbModule module;

  public DbModule_ProvideDbModelFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public DbModel get() {
    return provideDbModel(module);
  }

  public static DbModule_ProvideDbModelFactory create(DbModule module) {
    return new DbModule_ProvideDbModelFactory(module);
  }

  public static DbModel provideDbModel(DbModule instance) {
    return Preconditions.checkNotNull(instance.provideDbModel(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
