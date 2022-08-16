package com.xdl.stack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stack")
public class StackController {
    @RequestMapping("/reduce")
    public String stack () {
        return "hello stack";
    }
}
