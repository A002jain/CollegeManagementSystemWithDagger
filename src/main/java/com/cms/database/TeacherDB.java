package com.cms.database;

import com.cms.model.Teacher;

public class TeacherDB {

    Teacher teacher;

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
