package com.cms.service;

import com.cms.component.DaggerObjComponent;
import com.cms.database.Database;
import com.cms.database.DbModel;
import com.cms.model.Student;
import com.cms.model.Teacher;
import com.cms.repository.ICmsRepository;
import com.cms.validator.ICmsValidator;

import javax.inject.Inject;
import java.util.ArrayList;

public class CmsService implements ICmsService {

    ICmsRepository repository;
    Database database;
    DbModel dbModel;
    Teacher teacher;
    Student student;
    boolean flag=true;
    ICmsValidator validator;

    @Inject
    public CmsService(ICmsRepository repository, ICmsValidator validator){
        this.validator=validator;
        this.repository=repository;
    }

    @Override
    public DbModel create() {
        dbModel= DaggerObjComponent.create().provideDbModel();
        teacher= DaggerObjComponent.create().provideTeacher();
        student= DaggerObjComponent.create().provideStudent();
        if(flag) {
            teacher.setName("Abhi");
            teacher.setSalary(9000);
            teacher.setSubject("Physics");
            student.setName("Abhinav");
            student.setPercent(90.43);
            student.setRollNo("03");
            dbModel.setStudent(student);
            dbModel.setTeacher(teacher);
            repository.create(dbModel);
            flag=false;
        }else{
            teacher.setName("Harshit");
            teacher.setSalary(4000);
            teacher.setSubject("Math");
            student.setName("Deepanshu");
            student.setPercent(99.43);
            student.setRollNo("04");
            dbModel.setStudent(student);
            dbModel.setTeacher(teacher);
            repository.create(dbModel);
            flag=true;
        }
        return dbModel;
    }

    @Override
    public DbModel update(DbModel entity) {
        return null;
    }

    @Override
    public void read(DbModel key) {
        System.out.println(repository.read("1"));
    }

    @Override
    public void delete(DbModel key) {
        repository.delete("1");
    }

    @Override
    public void listN(int n) {
        repository.listN();
    }
}
