package com.provider.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceTest {
    public String ticket()
    {
        System.out.println("这是8002端口.........");
        return "第一次的Cloud注册";
    }
}
