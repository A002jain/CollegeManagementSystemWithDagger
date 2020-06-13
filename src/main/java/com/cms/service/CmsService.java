package com.cms.service;

import com.cms.component.DaggerObjComponent;
import com.cms.database.Database;
import com.cms.database.DbModel;
import com.cms.exception.CmsException;
import com.cms.model.Student;
import com.cms.model.Teacher;
import com.cms.repository.ICmsRepository;
import com.cms.stream.Input;
import com.cms.stream.Output;
import com.cms.validator.ICmsValidator;

import javax.inject.Inject;
import java.util.ArrayList;

public class CmsService implements ICmsService {

    Input input;
    Output output;
    ICmsRepository repository;
    Database database;
    DbModel dbModel;
    Teacher teacher;
    Student student;
    boolean flag=true;
    ICmsValidator validator;

    @Inject
    public CmsService(ICmsRepository repository, ICmsValidator validator,Input input,Output output){
        this.validator=validator;
        this.repository=repository;
        this.input=input;
        this.output=output;
    }

    @Override
    public DbModel create() throws CmsException {
        repository.create(put());
        output.print(dbModel);
        return dbModel;
    }

    @Override
    public DbModel update(DbModel entity) {
        return null;
    }

    @Override
    public void read(String key) {
        output.print(repository.read(key));
    }

    @Override
    public void delete(String key) {
        repository.delete(key);
    }

    @Override
    public void listN() {
        repository.listN();
    }

    private DbModel put() throws CmsException {
        dbModel= DaggerObjComponent.create().provideDbModel();
        teacher= DaggerObjComponent.create().provideTeacher();
        student= DaggerObjComponent.create().provideStudent();
        output.print("Enter Teacher Details");
        teacher.setName(input.getString("Name: "));
        teacher.setAge(input.getInt("Age: "));
        teacher.setSalary(input.getInt("Salary: "));
        teacher.setSubject(input.getString("Subject: "));
        output.print("Enter Student Details");
        student.setName(input.getString("Name: "));
        student.setAge(input.getInt("Age: "));
        student.setRollNo(input.getString("RollNo: "));
        student.setPercent(Double.parseDouble(input.getString("Percentage: ")));
        if(validator.studentValidator(student) && validator.teacherValidation(teacher))
        dbModel.setStudent(student);
        dbModel.setTeacher(teacher);
        return dbModel;

    }


}
