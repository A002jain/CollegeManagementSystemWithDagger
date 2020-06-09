package com.cms.provider;

import com.cms.model.Student;
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
public final class DbModule_ProvideStudentFactory implements Factory<Student> {
  private final DbModule module;

  public DbModule_ProvideStudentFactory(DbModule module) {
    this.module = module;
  }

  @Override
  public Student get() {
    return provideStudent(module);
  }

  public static DbModule_ProvideStudentFactory create(DbModule module) {
    return new DbModule_ProvideStudentFactory(module);
  }

  public static Student provideStudent(DbModule instance) {
    return Preconditions.checkNotNull(instance.provideStudent(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
