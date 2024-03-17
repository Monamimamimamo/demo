package com.example.demo.model;

public record JsonResponse(double price, JsonResponse.Info info) {
    public record Info(String date, int id) {}
}