package com.example.demo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HeadersController {

    @GetMapping("/headers")
    public List<String> getHeaders(@RequestHeader HttpHeaders headers) {
        return headers.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream()
                        .map(value -> entry.getKey() + ": " + value))
                .collect(Collectors.toList());
    }
}