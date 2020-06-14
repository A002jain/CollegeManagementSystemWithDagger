package com.cms.database;

import com.cms.model.Student;
import com.cms.model.Teacher;

import java.util.ArrayList;

public class Database {

    int i=0,j=0;
    private static ArrayList<StudentDB> studentDB = new ArrayList<>();
    private static ArrayList<TeacherDB> teacherDB = new ArrayList<>();

    public ArrayList<StudentDB> getStudentDB() {
        if(i==0) setDummyStudentData();
        return studentDB;
    }

    public ArrayList<TeacherDB> getTeacherDB(){
        if(j==0) setDummyTeacherData();
        return teacherDB;
    }

    private void setDummyStudentData(){
        i++;
        //1
        StudentDB studentD1=new StudentDB();
        Student student1=new Student();
        student1.setName("Manoj");
        student1.setAge(56);
        student1.setRollNo("1");
        student1.setPercent(90);
        studentD1.setStudent(student1);
        studentDB.add(studentD1);
        //2
        StudentDB studentD2=new StudentDB();
        Student student2=new Student();
        student2.setName("Pradeep");
        student2.setAge(53);
        student1.setRollNo("2");
        student1.setPercent(67);
        studentD2.setStudent(student2);
        studentDB.add(studentD2);
        //3
        StudentDB studentD3=new StudentDB();
        Student student3=new Student();
        student3.setName("Ashok");
        student3.setAge(52);
        student1.setRollNo("3");
        student1.setPercent(78);
        studentD3.setStudent(student3);
        studentDB.add(studentD3);
    }

    private void setDummyTeacherData(){
        j++;
        //1
        TeacherDB teacherD1=new TeacherDB();
        Teacher teacher1=new Teacher();
        teacher1.setName("Manoj");
        teacher1.setAge(56);
        teacher1.setSalary(45000);
        teacher1.setSubject("Chemistry");
        teacherD1.setTeacher(teacher1);
        teacherDB.add(teacherD1);
        //2
        TeacherDB teacherD2=new TeacherDB();
        Teacher teacher2=new Teacher();
        teacher2.setName("Pradeep");
        teacher2.setAge(53);
        teacher2.setSalary(43000);
        teacher2.setSubject("Physics");
        teacherD2.setTeacher(teacher2);
        teacherDB.add(teacherD2);
        //3
        TeacherDB teacherD3=new TeacherDB();
        Teacher teacher3=new Teacher();
        teacher3.setName("Ashok");
        teacher3.setAge(52);
        teacher3.setSalary(46000);
        teacher3.setSubject("Math");
        teacherD3.setTeacher(teacher3);
        teacherDB.add(teacherD3);
    }

}
