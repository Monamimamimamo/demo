package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BeanContextStartupListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        checkBeans(context);
    }

    public void checkBeans(ApplicationContext context) {
        if (context.containsBean("myBeanForTest")) {
            log.info("myBeanForTest is present");
        }
        if (context.containsBean("anotherBean")) {
            log.info("anotherBean is present");
        }
        if (context.containsBean("conditionalBean")) {
            log.info("conditionalBean is present");
        }
    }
}
