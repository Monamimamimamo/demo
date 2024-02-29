package com.example.demo.injections;

import com.example.demo.service.beans.EnglishMessageService;
import com.example.demo.service.beans.RussianMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {
    private EnglishMessageService englishMessageService;
    private RussianMessageService russianMessageService;

    @Autowired
    public void setEnglishMessageService(EnglishMessageService  englishMessageService) {
        this.englishMessageService = englishMessageService;
        System.out.println("Setter injection: " + englishMessageService.getMessage());
    }
    @Autowired
    public void setRussianMessageService(RussianMessageService  russianMessageService) {
        this.russianMessageService = russianMessageService;
        System.out.println("Setter injection: " + russianMessageService.getMessage());
    }
}
