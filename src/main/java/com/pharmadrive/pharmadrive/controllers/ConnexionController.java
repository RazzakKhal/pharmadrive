package com.pharmadrive.pharmadrive.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnexionController {

    @GetMapping("/hello")
    public String helloWolrd(){

        return "hello world";
    }
}
