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
public final class DbModule_ProvidesDbModleFactory implements Factory<DbModel> {
  private final DbModule module;

  public DbModule_ProvidesDbModleFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public DbModel get() {
    return providesDbModle(module);
  }

  public static DbModule_ProvidesDbModleFactory create(DbModule module) {
    return new DbModule_ProvidesDbModleFactory(module);
  }

  public static DbModel providesDbModle(DbModule instance) {
    return Preconditions.checkNotNull(instance.providesDbModle(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
