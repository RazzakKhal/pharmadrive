package com.pharmadrive.pharmadrive.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;
    @PostMapping("/register")
    Map<String, String> registerAnUser(@Valid @RequestBody RegisterUserDto registerUserDto){
        return authService.createUser(registerUserDto);
    }

    @PostMapping("/login")
    Map<String, String> loginAnUser(@Valid @RequestBody LoginUserDto loginUserDto){
        return authService.loginUser(loginUserDto);
    }

    @GetMapping("/me")
    UserDto getAnUser(Authentication authentication){
        return authService.getMe(authentication.getPrincipal());
    }
}
