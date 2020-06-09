package com.cms.component;

import com.cms.database.Database;
import com.cms.database.DbModel;
import com.cms.model.Student;
import com.cms.model.Teacher;
import com.cms.provider.DbModule;
import com.cms.provider.DbModule_ProvideIValidatorFactory;
import com.cms.provider.DbModule_ProvideStudentFactory;
import com.cms.provider.DbModule_ProvideTeacherFactory;
import com.cms.provider.DbModule_ProvidesDatabaseFactory;
import com.cms.provider.DbModule_ProvidesDbModelFactory;
import com.cms.repository.CmsRepository;
import com.cms.service.CmsService;
import com.cms.service.ICmsService;
import com.cms.validator.ICmsValidator;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
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
public final class DaggerObjComponent implements ObjComponent {
  private Provider<Database> providesDatabaseProvider;

  private Provider<ICmsValidator> provideIValidatorProvider;

  private Provider<DbModel> providesDbModelProvider;

  private Provider<Teacher> provideTeacherProvider;

  private Provider<Student> provideStudentProvider;

  private DaggerObjComponent(DbModule dbModuleParam) {

    initialize(dbModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ObjComponent create() {
    return new Builder().build();
  }

  private CmsRepository getCmsRepository() {
    return new CmsRepository(providesDatabaseProvider.get());}

  private CmsService getCmsService() {
    return new CmsService(getCmsRepository(), provideIValidatorProvider.get());}

  @SuppressWarnings("unchecked")
  private void initialize(final DbModule dbModuleParam) {
    this.providesDatabaseProvider = DoubleCheck.provider(DbModule_ProvidesDatabaseFactory.create(dbModuleParam));
    this.provideIValidatorProvider = DoubleCheck.provider(DbModule_ProvideIValidatorFactory.create(dbModuleParam));
    this.providesDbModelProvider = DoubleCheck.provider(DbModule_ProvidesDbModelFactory.create(dbModuleParam));
    this.provideTeacherProvider = DoubleCheck.provider(DbModule_ProvideTeacherFactory.create(dbModuleParam));
    this.provideStudentProvider = DoubleCheck.provider(DbModule_ProvideStudentFactory.create(dbModuleParam));
  }

  @Override
  public ICmsService providesCmsService() {
    return getCmsService();}

  @Override
  public DbModel provideDbModel() {
    return providesDbModelProvider.get();}

  @Override
  public Teacher provideTeacher() {
    return provideTeacherProvider.get();}

  @Override
  public Student provideStudent() {
    return provideStudentProvider.get();}

  public static final class Builder {
    private DbModule dbModule;

    private Builder() {
    }

    public Builder dbModule(DbModule dbModule) {
      this.dbModule = Preconditions.checkNotNull(dbModule);
      return this;
    }

    public ObjComponent build() {
      if (dbModule == null) {
        this.dbModule = new DbModule();
      }
      return new DaggerObjComponent(dbModule);
    }
  }
}
