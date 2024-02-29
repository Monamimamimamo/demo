package com.example.demo.injections;

import com.example.demo.service.beans.EnglishMessageService;
import com.example.demo.service.beans.RussianMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class FieldInjection {
    @Autowired
    private EnglishMessageService englishMessageService;
    @Autowired
    private RussianMessageService russianMessageService;

    @PostConstruct
    public void init() {
        System.out.println("Field injection: " + englishMessageService.getMessage());
        System.out.println("Field injection: " + russianMessageService.getMessage());
    }
}
