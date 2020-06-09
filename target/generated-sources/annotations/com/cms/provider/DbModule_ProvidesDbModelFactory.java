package com.cms.provider;

import com.cms.database.DbModel;
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
public final class DbModule_ProvidesDbModelFactory implements Factory<DbModel> {
  private final DbModule module;

  public DbModule_ProvidesDbModelFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public DbModel get() {
    return providesDbModel(module);
  }

  public static DbModule_ProvidesDbModelFactory create(DbModule module) {
    return new DbModule_ProvidesDbModelFactory(module);
  }

  public static DbModel providesDbModel(DbModule instance) {
    return Preconditions.checkNotNull(instance.providesDbModel(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
