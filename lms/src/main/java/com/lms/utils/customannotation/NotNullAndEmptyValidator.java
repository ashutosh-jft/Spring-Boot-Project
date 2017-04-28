package com.lms.utils.customannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bhushan on 28/4/17.
 */
public class NotNullAndEmptyValidator implements ConstraintValidator<NotEmptyAndNull, String>{
    @Override
    public void initialize(NotEmptyAndNull constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null && value.length() > 0 ){
            return true;
        }
        return false;
    }
}
