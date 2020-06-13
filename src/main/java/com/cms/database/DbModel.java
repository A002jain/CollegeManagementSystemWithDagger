package com.cms.database;

import com.cms.model.Student;
import com.cms.model.Teacher;

public class DbModel {

    Student student;
    Teacher teacher;

    @Override
    public String toString() {
        return "DbModel{" +
                "student=" + student.toString() +
                ", teacher=" + teacher.toString() +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}


