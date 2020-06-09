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
public final class DbModule_ProvidesDbModuleFactory implements Factory<DbModule> {
  private final DbModule module;

  public DbModule_ProvidesDbModuleFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public DbModule get() {
    return providesDbModule(module);
  }

  public static DbModule_ProvidesDbModuleFactory create(DbModule module) {
    return new DbModule_ProvidesDbModuleFactory(module);
  }

  public static DbModule providesDbModule(DbModule instance) {
    return Preconditions.checkNotNull(instance.providesDbModule(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
