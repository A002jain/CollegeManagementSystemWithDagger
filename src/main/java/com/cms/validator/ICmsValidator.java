package com.cms.validator;

import com.cms.model.Student;
import com.cms.model.Teacher;

public interface ICmsValidator {

    String INT_REGEX="^[0-9]*$";
    String STRING_REGEX="^[a-z\\sA-Z]*$";
    String EMAIL_REGEX="^[A-Z][A-Z0-9]*@GMAIL.COM$";
    int MAX_AGE=150;
    boolean nameValidator(String name);

    boolean ageValidator(int age);

    boolean percentValidator(double n);

    boolean rollNoValidator(String rollNo);

    public boolean salaryValidator(int salary);

    public boolean subjectValidator(String subject);

    boolean studentValidator(Student student);

    boolean teacherValidation(Teacher teacher);
}
