package com.cms.provider;

import com.cms.stream.Input;
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
public final class DbModule_ProvidesInputFactory implements Factory<Input> {
  private final DbModule module;

  public DbModule_ProvidesInputFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public Input get() {
    return providesInput(module);
  }

  public static DbModule_ProvidesInputFactory create(DbModule module) {
    return new DbModule_ProvidesInputFactory(module);
  }

  public static Input providesInput(DbModule instance) {
    return Preconditions.checkNotNull(instance.providesInput(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
