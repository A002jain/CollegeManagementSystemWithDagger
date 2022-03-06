package com.cms.service;

import com.cms.database.StudentDB;
import com.cms.database.TeacherDB;
import com.cms.repository.ICmsRepository;
import com.cms.stream.Input;
import com.cms.stream.Output;
import com.cms.validator.ICmsValidator;
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
public final class CmsService_Factory implements Factory<CmsService> {
  private final Provider<ICmsRepository> repositoryProvider;

  private final Provider<ICmsValidator> validatorProvider;

  private final Provider<Input> inputProvider;

  private final Provider<Output> outputProvider;

  private final Provider<TeacherDB> teacherDBProvider;

  private final Provider<StudentDB> studentDBProvider;

  public CmsService_Factory(Provider<ICmsRepository> repositoryProvider,
      Provider<ICmsValidator> validatorProvider, Provider<Input> inputProvider,
      Provider<Output> outputProvider, Provider<TeacherDB> teacherDBProvider,
      Provider<StudentDB> studentDBProvider) {
    this.repositoryProvider = repositoryProvider;
    this.validatorProvider = validatorProvider;
    this.inputProvider = inputProvider;
    this.outputProvider = outputProvider;
    this.teacherDBProvider = teacherDBProvider;
    this.studentDBProvider = studentDBProvider;
  }

  @Override
  public CmsService get() {
    return newInstance(repositoryProvider.get(), validatorProvider.get(), inputProvider.get(), outputProvider.get(), teacherDBProvider.get(), studentDBProvider.get());
  }

  public static CmsService_Factory create(Provider<ICmsRepository> repositoryProvider,
      Provider<ICmsValidator> validatorProvider, Provider<Input> inputProvider,
      Provider<Output> outputProvider, Provider<TeacherDB> teacherDBProvider,
      Provider<StudentDB> studentDBProvider) {
    return new CmsService_Factory(repositoryProvider, validatorProvider, inputProvider, outputProvider, teacherDBProvider, studentDBProvider);
  }

  public static CmsService newInstance(ICmsRepository repository, ICmsValidator validator,
      Input input, Output output, TeacherDB teacherDB, StudentDB studentDB) {
    return new CmsService(repository, validator, input, output, teacherDB, studentDB);
  }
}
