package com.demo.springboot.springboot2junit5mockito.controller;

import com.demo.springboot.springboot2junit5mockito.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    public @ResponseBody
    String greeting() {
        return helloService.getWelcomeMessage();
    }
}
