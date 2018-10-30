package com.elderstudios.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @GetMapping ("/")
    public String sayHello () {
        return "helloworld";
    }
}
