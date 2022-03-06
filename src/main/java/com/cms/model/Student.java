package com.cms.model;

import javax.inject.Inject;

public class Student {

    private String name;
    private String rollNo;
    private double percent;
    private int age;

    @Inject
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) { this.percent = percent; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", percent=" + percent +
                ", age=" + age +
                '}';
    }
}
