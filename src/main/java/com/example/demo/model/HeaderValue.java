package com.example.demo.model;


public record HeaderValue(String header, String value) {
    public record Info(String header, String value) {}
}