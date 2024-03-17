package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class JsonResponse {
    private double price;
    private Info info;
    @Data
    @AllArgsConstructor
    public static class Info {
        private String date;
        private int id;
    }
}