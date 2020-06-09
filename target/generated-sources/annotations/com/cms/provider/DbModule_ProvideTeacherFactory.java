package com.cms.provider;

import com.cms.model.Teacher;
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
public final class DbModule_ProvideTeacherFactory implements Factory<Teacher> {
  private final DbModule module;

  public DbModule_ProvideTeacherFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public Teacher get() {
    return provideTeacher(module);
  }

  public static DbModule_ProvideTeacherFactory create(DbModule module) {
    return new DbModule_ProvideTeacherFactory(module);
  }

  public static Teacher provideTeacher(DbModule instance) {
    return Preconditions.checkNotNull(instance.provideTeacher(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
