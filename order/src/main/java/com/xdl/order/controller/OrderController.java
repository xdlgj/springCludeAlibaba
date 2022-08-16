package com.xdl.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String order() {
        System.out.println("下单成功!");
        String msg = restTemplate.getForObject("http://localhost:8082/stack/reduce", String.class);
        return "hello order " + msg;
    }
}
