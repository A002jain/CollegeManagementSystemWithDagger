package com.cms.database;

import com.cms.model.Student;

public class StudentDB {

    Student student;

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
