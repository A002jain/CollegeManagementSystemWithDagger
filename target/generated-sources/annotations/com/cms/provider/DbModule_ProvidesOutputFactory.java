package com.cms.provider;

import com.cms.stream.Output;
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
public final class DbModule_ProvidesOutputFactory implements Factory<Output> {
  private final DbModule module;

  public DbModule_ProvidesOutputFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public Output get() {
    return providesOutput(module);
  }

  public static DbModule_ProvidesOutputFactory create(DbModule module) {
    return new DbModule_ProvidesOutputFactory(module);
  }

  public static Output providesOutput(DbModule instance) {
    return Preconditions.checkNotNull(instance.providesOutput(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
