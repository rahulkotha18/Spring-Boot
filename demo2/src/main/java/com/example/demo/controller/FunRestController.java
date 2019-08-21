package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class FunRestController {
    @GetMapping("/")
    public String sayHello()
    {

        return  "Hello hii";
    }
    @GetMapping("/rahul")
    public String sayHello2()
    {

        return  "Hello Rahul";
    }
    @GetMapping("/sreetej")
    public String sayHello3()
    {

        return  "Hello sreetej";
    }

}
