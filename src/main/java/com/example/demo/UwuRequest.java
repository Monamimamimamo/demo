package com.example.demo;

import lombok.Data;

@Data
public class UwuRequest {
    @MyCustomValidation
    private String s;

}
