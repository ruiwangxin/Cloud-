package com.provider.controller;

import com.provider.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContrlloerTest {
    @Autowired
    ServiceTest serviceTest;
    @GetMapping("/ticket")
    public String addTest01()
    {
        return serviceTest.ticket();
    }
}
