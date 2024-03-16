package com.example.demo.Beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AnotherBean {
    private TestBean bean;

    public AnotherBean(TestBean bean) {
        this.bean = bean;
    }

}
