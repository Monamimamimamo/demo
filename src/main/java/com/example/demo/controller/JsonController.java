package com.example.demo.controller;

import com.example.demo.model.JsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @PostMapping("/json")
    public ResponseEntity<JsonResponse> processJson(@RequestBody JsonResponse jsonResponse) {
        jsonResponse.getInfo().setId(123);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}
