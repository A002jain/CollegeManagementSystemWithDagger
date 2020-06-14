package com.cms.provider;

import com.cms.database.TeacherDB;
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
public final class DbModule_ProvideTeacherDBFactory implements Factory<TeacherDB> {
  private final DbModule module;

  public DbModule_ProvideTeacherDBFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public TeacherDB get() {
    return provideTeacherDB(module);
  }

  public static DbModule_ProvideTeacherDBFactory create(DbModule module) {
    return new DbModule_ProvideTeacherDBFactory(module);
  }

  public static TeacherDB provideTeacherDB(DbModule instance) {
    return Preconditions.checkNotNull(instance.provideTeacherDB(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
