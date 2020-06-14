package com.cms;

import com.cms.exception.CmsException;
import com.cms.menu.Menu;

public class App {

    public static void main(String[] args) {
            Menu menu = new Menu();
        try {
            menu.DisplayMenu();
        } catch (CmsException e) {
            e.printStackTrace();
        }
    }
}
