package com.cms.repository;

import com.cms.database.Database;
import com.cms.database.DbModel;

import javax.inject.Inject;
import java.util.ArrayList;

public class CmsRepository implements ICmsRepository {

    ArrayList<DbModel> database;

    @Inject
    public CmsRepository(Database database){
        this.database =database.getDatabase();
    }

    @Override
    public void create(DbModel entity) {
            database.add(entity);
    }

    @Override
    public void update(DbModel entity) {
            database.add(entity);
    }

    @Override
    public DbModel read(String key) {
        String[] metaData=key.split("#");
        String mapper=metaData[0];
        String id=metaData[1];
        switch (mapper){
            case "student":
                for(DbModel dbModel:database){
                    if(dbModel.getStudent().getRollNo().equals(id))
                        return dbModel;
                }
                break;
            case "teacher":
                for(DbModel dbModel:database){
                    if(dbModel.getTeacher().getName().equals(id))
                        return dbModel;
                }
                break;
        }
        return null;
    }

    @Override
    public void delete(String key) {
        database.remove(0);
    }

    @Override
    public void listN() {
        for(DbModel dbModel: database){
            System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(dbModel.toString());
        }
    }

    @Override
    public void listN(int n) {

        for(DbModel dbModel: database){
            System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(dbModel.toString());
        }
    }
}
