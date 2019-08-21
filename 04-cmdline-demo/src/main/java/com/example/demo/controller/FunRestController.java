package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class FunRestController {
    @Value("${coach.name}")
    private  String coach;

    @GetMapping("/getCoach")
    public String getCoach() {
        return coach;
    }
    @GetMapping("/getTeam")
    public String getTeam() {
        return team;
    }

    @Value("${team.name}")
    private String team;

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
