package com.example.demo.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
public class ErrorResponse {
    private final HttpStatus status;
    private final String message;
    private final Object data;

}
