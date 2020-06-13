package com.cms;

import com.cms.component.DaggerObjComponent;
import com.cms.database.DbModel;
import com.cms.exception.CmsException;
import com.cms.service.ICmsService;

public class App {

    public static void main(String[] args) { ;
        ICmsService service= DaggerObjComponent.builder().build().providesCmsService();
        try {
            service.create();
            service.read("student#12");
            service.listN();
        } catch (CmsException e) {
            e.printStackTrace();
        }
    }
}
