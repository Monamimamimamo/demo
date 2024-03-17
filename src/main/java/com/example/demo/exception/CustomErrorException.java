package com.example.demo.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class CustomErrorException extends RuntimeException {
    private final HttpStatus status;
    private final String message;
    private final Object data;
}
