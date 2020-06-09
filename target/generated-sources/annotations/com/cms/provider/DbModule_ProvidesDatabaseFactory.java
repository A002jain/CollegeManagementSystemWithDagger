package com.cms.provider;

import com.cms.database.Database;
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
public final class DbModule_ProvidesDatabaseFactory implements Factory<Database> {
  private final DbModule module;

  public DbModule_ProvidesDatabaseFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public Database get() {
    return providesDatabase(module);
  }

  public static DbModule_ProvidesDatabaseFactory create(DbModule module) {
    return new DbModule_ProvidesDatabaseFactory(module);
  }

  public static Database providesDatabase(DbModule instance) {
    return Preconditions.checkNotNull(instance.providesDatabase(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
