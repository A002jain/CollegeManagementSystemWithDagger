package com.cms;

import com.cms.component.DaggerObjComponent;
import com.cms.database.DbModel;
import com.cms.service.ICmsService;

public class App {

    public static void main(String[] args) { ;
        ICmsService service= DaggerObjComponent.builder().build().providesCmsService();
        System.out.println(service.create());
        //service.read(new DbModel());
        System.out.println(service.create());
        service.listN(1);

    }
}
