package com.cms.database;

import com.cms.model.Teacher;

import javax.inject.Inject;

public class TeacherDB {

    Teacher teacher;

    @Inject
    public TeacherDB(){

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "TeacherDB{" +
                "teacher=" + teacher +
                '}';
    }

}
