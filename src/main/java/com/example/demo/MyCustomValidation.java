package com.example.demo;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = MyCustomValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomValidation {
    String message() default "Ошибка валидации";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
