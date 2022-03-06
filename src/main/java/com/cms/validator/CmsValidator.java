package com.cms.validator;

import com.cms.model.Student;
import com.cms.model.Teacher;
import javax.inject.Inject;


public class CmsValidator implements ICmsValidator {

    @Inject
    public CmsValidator(){

    }

    @Override
    public boolean nameValidator(String name) {
        boolean bool = ((name != null)
                && (!name.equals(""))
                && (name.matches(STRING_REGEX)));
        return bool;
    }

    @Override
    public boolean ageValidator(int age) {
        boolean bool=true;
        if(age<0 || age>MAX_AGE)
            bool=false;
        return bool;
    }


    @Override
    public boolean percentValidator(double n) {
        if(n>100 && n>-1)
            return false;
        return true;
    }

    @Override
    public boolean rollNoValidator(String rollNo){
        //TODO: implement rollNo validator
        return true;
    }

    @Override
    public boolean salaryValidator(int salary){
        if(salary > 0)
            return true;
        return false;
    }

    @Override
    public boolean subjectValidator(String subject){
        return nameValidator(subject);
        //TODO: create list of subject and check the list of subject available
    }

    @Override
    public boolean studentValidator(Student student) {
        return (nameValidator(student.getName()) &&
                ageValidator(student.getAge())  &&
                percentValidator(student.getPercent()) &&
                rollNoValidator(student.getRollNo())
        );
    }

    @Override
    public boolean teacherValidation(Teacher teacher) {
        return (nameValidator(teacher.getName()) &&
                ageValidator(teacher.getAge())  &&
                salaryValidator(teacher.getSalary()) &&
                subjectValidator(teacher.getSubject())
        );
    }
}
