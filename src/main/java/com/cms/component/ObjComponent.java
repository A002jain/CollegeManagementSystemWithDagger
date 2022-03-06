package com.cms.component;

import com.cms.menu.Menu;
import com.cms.modules.ServiceModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = ServiceModule.class)
public interface ObjComponent {

    Menu provideMenu();

}
