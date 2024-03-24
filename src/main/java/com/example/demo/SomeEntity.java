package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SomeEntity {
    @MyCustomValidation
    private String someField;
}
