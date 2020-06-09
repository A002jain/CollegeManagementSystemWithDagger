package com.cms.validator;

public interface ICmsValidator {

    String INT_REGEX="^[0-9]*$";
    String STRING_REGEX="^[a-z\\sA-Z]*$";
    String EMAIL_REGEX="^[A-Z][A-Z0-9]*@GMAIL.COM$";
    int MAX_AGE=150;
    boolean nameValidator(String name);

    boolean ageValidator(int age);

    boolean percentValidator(double n);
}
