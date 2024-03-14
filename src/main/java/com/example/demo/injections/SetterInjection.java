package com.example.demo.injections;

import com.example.demo.service.MessageService;
import com.example.demo.service.beans.EnglishMessageService;
import com.example.demo.service.beans.RussianMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SetterInjection {
    private MessageService englishMessageService;
    private MessageService russianMessageService;

    @Autowired
    public void setEnglishMessageService(EnglishMessageService  englishMessageService) {
        this.englishMessageService = englishMessageService;
        log.info("Setter injection: " + englishMessageService.getMessage());
    }
    @Autowired
    public void setRussianMessageService(RussianMessageService  russianMessageService) {
        this.russianMessageService = russianMessageService;
        log.info("Setter injection: " + russianMessageService.getMessage());
    }
}
