package com.example.demo;


import com.example.demo.Beans.AnotherBean;
import com.example.demo.Beans.ConditionalBean;
import com.example.demo.Beans.TestBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class config {
    @Profile("test")
    @Bean
    public TestBean myBeanForTest() {
        return new TestBean();
    }

    @ConditionalOnBean(TestBean.class)
    @Bean
    public AnotherBean anotherBean() {
        return new AnotherBean();
    }

    @ConditionalOnProperty(name = "EXAMPLE_TEST ",havingValue = "!default", matchIfMissing = true)
    @Bean
    public ConditionalBean conditionalBean() {
        return new ConditionalBean();
    }
}
