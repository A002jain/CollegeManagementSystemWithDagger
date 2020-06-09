package com.cms.repository;

import com.cms.database.Database;
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
public final class CmsRepository_Factory implements Factory<CmsRepository> {
  private final Provider<Database> databaseProvider;

  public CmsRepository_Factory(Provider<Database> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public CmsRepository get() {
    return newInstance(databaseProvider.get());
  }

  public static CmsRepository_Factory create(Provider<Database> databaseProvider) {
    return new CmsRepository_Factory(databaseProvider);
  }

  public static CmsRepository newInstance(Database database) {
    return new CmsRepository(database);
  }
}
