package com.cms.component;

import com.cms.database.Database;
import com.cms.database.Database_Factory;
import com.cms.database.StudentDB_Factory;
import com.cms.database.TeacherDB_Factory;
import com.cms.menu.Menu;
import com.cms.repository.CmsRepository;
import com.cms.repository.CmsRepository_Factory;
import com.cms.repository.ICmsRepository;
import com.cms.service.CmsService;
import com.cms.service.CmsService_Factory;
import com.cms.service.ICmsService;
import com.cms.stream.Input;
import com.cms.stream.Input_Factory;
import com.cms.stream.Output;
import com.cms.stream.Output_Factory;
import com.cms.validator.CmsValidator_Factory;
import com.cms.validator.ICmsValidator;
import dagger.internal.DoubleCheck;
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
  private Provider<Input> inputProvider;

  private Provider<Output> outputProvider;

  private Provider<Database> databaseProvider;

  private Provider<CmsRepository> cmsRepositoryProvider;

  private Provider<ICmsRepository> provideCmsRepositoryProvider;

  private Provider<ICmsValidator> provideCmsValidatorProvider;

  private Provider<CmsService> cmsServiceProvider;

  private Provider<ICmsService> provideCmsServiceProvider;

  private DaggerObjComponent() {

    initialize();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ObjComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.inputProvider = DoubleCheck.provider(Input_Factory.create());
    this.outputProvider = DoubleCheck.provider(Output_Factory.create());
    this.databaseProvider = DoubleCheck.provider(Database_Factory.create());
    this.cmsRepositoryProvider = CmsRepository_Factory.create(databaseProvider);
    this.provideCmsRepositoryProvider = DoubleCheck.provider((Provider) cmsRepositoryProvider);
    this.provideCmsValidatorProvider = DoubleCheck.provider((Provider) CmsValidator_Factory.create());
    this.cmsServiceProvider = CmsService_Factory.create(provideCmsRepositoryProvider, provideCmsValidatorProvider, inputProvider, outputProvider, TeacherDB_Factory.create(), StudentDB_Factory.create());
    this.provideCmsServiceProvider = DoubleCheck.provider((Provider) cmsServiceProvider);
  }

  @Override
  public Menu provideMenu() {
    return new Menu(inputProvider.get(), outputProvider.get(), provideCmsServiceProvider.get(), provideCmsServiceProvider.get());}

  public static final class Builder {
    private Builder() {
    }

    public ObjComponent build() {
      return new DaggerObjComponent();
    }
  }
}
