package com.cms;

import com.cms.component.DaggerObjComponent;
import com.cms.exception.CmsException;

public class App {

    public static void main(String[] args) {
        try {
            DaggerObjComponent.create().provideMenu().displayMenu();
        } catch (CmsException e) {
            e.printStackTrace();
        }
    }
}
