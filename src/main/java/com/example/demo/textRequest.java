package com.example.demo;

import lombok.Data;

@Data
public class textRequest {
    @MyCustomValidation
    private String text;

}
