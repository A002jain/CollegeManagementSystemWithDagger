package com.cms;

import com.cms.stream.Input;
import com.cms.stream.Output;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class Menu_MembersInjector implements MembersInjector<Menu> {
  private final Provider<Input> inputProvider;

  private final Provider<Output> outputProvider;

  public Menu_MembersInjector(Provider<Input> inputProvider, Provider<Output> outputProvider) {
    this.inputProvider = inputProvider;
    this.outputProvider = outputProvider;
  }

  public static MembersInjector<Menu> create(Provider<Input> inputProvider,
      Provider<Output> outputProvider) {
    return new Menu_MembersInjector(inputProvider, outputProvider);}

  @Override
  public void injectMembers(Menu instance) {
    injectInput(instance, inputProvider.get());
    injectOutput(instance, outputProvider.get());
  }

  @InjectedFieldSignature("com.cms.Menu.input")
  public static void injectInput(Menu instance, Input input) {
    instance.input = input;
  }

  @InjectedFieldSignature("com.cms.Menu.output")
  public static void injectOutput(Menu instance, Output output) {
    instance.output = output;
  }
}
