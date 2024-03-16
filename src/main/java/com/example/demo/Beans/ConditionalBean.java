package com.example.demo.Beans;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
public class ConditionalBean {
    private String exampleTestValue;

    public ConditionalBean(@Value("${EXAMPLE_TEST }") String exampleTestValue) {
        this.exampleTestValue = exampleTestValue;
    }

}
