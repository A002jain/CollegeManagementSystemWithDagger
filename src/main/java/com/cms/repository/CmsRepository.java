package com.cms.repository;

import com.cms.database.Database;
import com.cms.database.StudentDB;
import com.cms.database.TeacherDB;

import javax.inject.Inject;

public class CmsRepository implements ICmsRepository {

    Database database;
    boolean flag;
    @Inject
    public CmsRepository(Database database){
        this.database =database;
    }

    @Override
    public void create(Object entity) {
        if(flag)
            database.getTeacherDB().add((TeacherDB) entity);
        else
            database.getStudentDB().add((StudentDB) entity);
    }

    @Override
    public void update(Object entity) {
        if(flag)
            database.getTeacherDB().add((TeacherDB) entity);
        else
            database.getStudentDB().add((StudentDB) entity);

    }

    @Override
    public Object read(String key) {
        String[] metaData=key.split("#");
        String mapper=metaData[0];
        String id=metaData[1];

        switch (mapper){
            case "student":
                for(StudentDB studentDB:database.getStudentDB()){
                    if(studentDB.getStudent().getRollNo().equals(id))
                        return studentDB;
                }
                break;
            case "teacher":
                for(TeacherDB teacherDB:database.getTeacherDB()){
                    if(teacherDB.getTeacher().getName().equals(id))
                        return teacherDB;
                }
                break;
        }
        return null;
    }

    @Override
    public void delete(String key) {
        Object object=read(key);
        if(flag)
            database.getTeacherDB().remove(object);
        else
            database.getStudentDB().remove(object);

    }

    @Override
    public Object listN() {
        if(flag)
            return database.getTeacherDB();
        else
            return database.getStudentDB();
    }

    @Override
    public Object listN(int n) {
/*
        for(DbModel dbModel: database){
            System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(dbModel.toString());
        }

 */ return null;
    }

    public void setFlag(boolean flag){
        this.flag=flag;
    }

}
