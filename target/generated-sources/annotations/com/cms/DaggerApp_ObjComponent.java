package com.cms;

import com.cms.provider.DbModule;
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
public final class DaggerApp_ObjComponent implements App.ObjComponent {
  private DaggerApp_ObjComponent() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static App.ObjComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dbModule(DbModule dbModule) {
      Preconditions.checkNotNull(dbModule);
      return this;
    }

    public App.ObjComponent build() {
      return new DaggerApp_ObjComponent();
    }
  }
}
