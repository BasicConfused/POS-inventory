package com.doubleG.toffeeCoffee.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class indexController {
    @GetMapping("/index")
    public String login(){
        return "index";
    }

    @GetMapping("/Sign-up")
    public String signup(){
        return "Sign-up";
    }

}
