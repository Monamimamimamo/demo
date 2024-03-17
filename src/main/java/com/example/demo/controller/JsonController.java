package com.example.demo.controller;

import com.example.demo.exception.CustomErrorException;
import com.example.demo.model.JsonRequest;
import com.example.demo.model.JsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @PostMapping("/json")
    public JsonResponse processJson(@RequestBody JsonRequest jsonRequest) {
        if (jsonRequest.info() == null) {
            throw new CustomErrorException(HttpStatus.BAD_REQUEST, "Info cannot be null", null);
        }
        JsonResponse.Info newInfo = new JsonResponse.Info(jsonRequest.info().date(), 123);
        return new JsonResponse(jsonRequest.price(), newInfo);
    }
}
