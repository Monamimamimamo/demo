package com.example.demo.injections;

import com.example.demo.service.beans.EnglishMessageService;
import com.example.demo.service.beans.RussianMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    private EnglishMessageService englishMessageService;
    private RussianMessageService russianMessageService;

    @Autowired
    public ConstructorInjection(EnglishMessageService englishMessageService, RussianMessageService russianMessageService) {
        this.englishMessageService = englishMessageService;
        this.russianMessageService = russianMessageService;
        System.out.println("Constructor injection: " + englishMessageService.getMessage());
        System.out.println("Constructor injection: " + russianMessageService.getMessage());
    }
}
