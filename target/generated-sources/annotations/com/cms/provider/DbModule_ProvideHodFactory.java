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
public final class DbModule_ProvideHodFactory implements Factory<Hod> {
  private final DbModule module;

  public DbModule_ProvideHodFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public Hod get() {
    return provideHod(module);
  }

  public static DbModule_ProvideHodFactory create(DbModule module) {
    return new DbModule_ProvideHodFactory(module);
  }

  public static Hod provideHod(DbModule instance) {
    return Preconditions.checkNotNull(instance.provideHod(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
