package com.example.demo;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MyCustomValidator implements ConstraintValidator<MyCustomValidation, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.length() > 5;
    }
}
