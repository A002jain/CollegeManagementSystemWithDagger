package com.cms.validator;

public class CmsValidator implements ICmsValidator {
    @Override
    public boolean nameValidator(String name) {
        boolean bool=   ((name != null)
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
}
