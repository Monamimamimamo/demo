package com.example.demo.injections;

import com.example.demo.service.MessageService;
import com.example.demo.service.beans.EnglishMessageService;
import com.example.demo.service.beans.RussianMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Slf4j
public class FieldInjection {
    @Autowired
    private MessageService englishMessageService;
    @Autowired
    private MessageService russianMessageService;

    @PostConstruct
    public void init() {
        log.info("Field injection: " + englishMessageService.getMessage());
        log.info("Field injection: " + russianMessageService.getMessage());
    }
}
