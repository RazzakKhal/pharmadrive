package com.pharmadrive.pharmadrive.controllers;

import com.pharmadrive.pharmadrive.models.User;
import com.pharmadrive.pharmadrive.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ConnexionController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/hello")
    public User helloWolrd(){

        Optional<User> user = userRepository.findByEmail("test@test.com");
        if(user.isPresent()){
            return user.get();
        }
        throw new RuntimeException("helloworld");
    }
}
