package com.example.demo.model;

public record JsonRequest(double price, Info info) {
    public record Info(String date) {}
}
