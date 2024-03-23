package com.example.demo.injections;

import com.example.demo.service.MessageService;
import com.example.demo.service.beans.EnglishMessageService;
import com.example.demo.service.beans.RussianMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ConstructorInjection {
    private final MessageService englishMessageService;
    private final MessageService russianMessageService;

    public ConstructorInjection(EnglishMessageService englishMessageService, RussianMessageService russianMessageService) {
        this.englishMessageService = englishMessageService;
        this.russianMessageService = russianMessageService;
        log.info("Constructor injection: " + englishMessageService.getMessage());
        log.info("Constructor injection: " + russianMessageService.getMessage());
    }
}
