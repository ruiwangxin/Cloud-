package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerUser {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/buy")
    public String Buyticket(String name)
    {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://PROVIDER/ticket", String.class);
        return name+"购买了"+forEntity;
    }
}
