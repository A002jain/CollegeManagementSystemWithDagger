package com.cms.database;

import com.cms.model.Student;

import javax.inject.Inject;

public class StudentDB {

    Student student;

    @Inject
    public StudentDB(){
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "student=" + student +
                '}';
    }
}
