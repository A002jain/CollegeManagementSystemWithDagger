package com.cms.database;

import com.cms.model.Hod;
import com.cms.model.Student;
import com.cms.model.Teacher;
import java.util.ArrayList;

public class DbModel {

    ArrayList<Hod> hod;
    Student student;
    Teacher teacher;

    public ArrayList<Hod> getHod() {
        return hod;
    }

    public void setHod(ArrayList<Hod> hod) {
        this.hod = hod;
    }

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


