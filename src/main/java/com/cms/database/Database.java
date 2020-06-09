package com.cms.database;

import java.util.ArrayList;

public class Database {

    private static ArrayList<DbModel> database =new ArrayList<DbModel>();

    public ArrayList<DbModel> getDatabase() {
        return database;
    }

}
