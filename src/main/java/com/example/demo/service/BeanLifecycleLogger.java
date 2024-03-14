package com.example.demo.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycleLogger {

    @PostConstruct
    public void onPostConstruct() {
        System.out.println("Bean создался");
    }

    @PreDestroy
    public void onPreDestroy() {
        System.out.println("Bean помер");
    }
}
