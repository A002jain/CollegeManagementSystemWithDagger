package com.cms.service;

import com.cms.component.DaggerObjComponent;
import com.cms.database.StudentDB;
import com.cms.database.TeacherDB;
import com.cms.exception.CmsException;
import com.cms.model.Student;
import com.cms.model.Teacher;
import com.cms.repository.ICmsRepository;
import com.cms.stream.Input;
import com.cms.stream.Output;
import com.cms.validator.ICmsValidator;

import javax.inject.Inject;
public class CmsService implements ICmsService {

    public boolean flag;
    String hash;
    Teacher teacher;
    Student student;
    TeacherDB teacherDB;
    StudentDB studentDB;
    Input input;
    Output output;
    ICmsRepository repository;
    ICmsValidator validator;

    @Inject
    public CmsService(ICmsRepository repository, ICmsValidator validator,Input input,Output output){
        this.validator=validator;
        this.repository=repository;
        this.input=input;
        this.output=output;
    }

    @Override
    public Object create() throws CmsException {
        if(flag) {
            repository.create(putTeacherDB());
            return teacherDB;
        }
        else {
            repository.create(putStudentDB());
            return studentDB;
        }
    }

    @Override
    public Object update() {
        String key=hash+"#"+input.getString("Enter Key:");
        Object object= repository.read(key);
        if(flag) {
            studentDB= (StudentDB) object;
            repository.create(studentDB);
            return teacherDB;
        }
        else {
            teacherDB= (TeacherDB) object;
            repository.create(teacherDB);
            return studentDB;
        }
    }

    @Override
    public void read() {
        String key=hash+"#"+input.getString("Enter Key:");
        output.print(repository.read(key));
    }

    @Override
    public void delete() {
        String key=hash+"#"+input.getString("Enter Key:");
        repository.delete(key);
    }

    @Override
    public void listN() {
        output.print(repository.listN());
    }

    private TeacherDB putTeacherDB() throws CmsException {
        teacherDB=DaggerObjComponent.create().provideTeacherDatabase();
        teacher= DaggerObjComponent.create().provideTeacher();
        output.print("Enter Teacher Details");
        teacher.setName(input.getString("Name: "));
        teacher.setAge(input.getInt("Age: "));
        teacher.setSalary(input.getInt("Salary: "));
        teacher.setSubject(input.getString("Subject: "));
        if(validator.teacherValidation(teacher))
            teacherDB.setTeacher(teacher);
        return teacherDB;
    }
    private StudentDB putStudentDB()throws CmsException{
        studentDB=DaggerObjComponent.create().provideStudentDatabase();
        student= DaggerObjComponent.create().provideStudent();
        output.print("Enter Student Details");
        student.setName(input.getString("Name: "));
        student.setAge(input.getInt("Age: "));
        student.setRollNo(input.getString("RollNo: "));
        student.setPercent(Double.parseDouble(input.getString("Percentage: ")));
        if(validator.studentValidator(student))
            studentDB.setStudent(student);
        return studentDB;
    }

    public void setFlag(boolean flag){
        repository.setFlag(flag);
        this.flag=flag;
        if(flag)
            hash="teacher";
        else
            hash="student";
    }


}
