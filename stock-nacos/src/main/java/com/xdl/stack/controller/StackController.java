package com.xdl.stack.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stack")
public class StackController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/reduce")
    public String stack () {
        return "hello stack:" + port;
    }
}
