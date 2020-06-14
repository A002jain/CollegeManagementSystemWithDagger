package com.cms.provider;

import com.cms.database.StudentDB;
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
public final class DbModule_ProvideStudentDBFactory implements Factory<StudentDB> {
  private final DbModule module;

  public DbModule_ProvideStudentDBFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public StudentDB get() {
    return provideStudentDB(module);
  }

  public static DbModule_ProvideStudentDBFactory create(DbModule module) {
    return new DbModule_ProvideStudentDBFactory(module);
  }

  public static StudentDB provideStudentDB(DbModule instance) {
    return Preconditions.checkNotNull(instance.provideStudentDB(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
