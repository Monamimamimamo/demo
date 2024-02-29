package com.example.demo.service.beans;

import com.example.demo.service.MessageService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EnglishMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello, World!";
    }
}
