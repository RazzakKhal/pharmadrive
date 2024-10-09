package com.pharmadrive.pharmadrive.controllers;

import com.pharmadrive.pharmadrive.dtos.fromView.LoginUserDto;
import com.pharmadrive.pharmadrive.dtos.toView.UserDto;
import com.pharmadrive.pharmadrive.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;
    @PostMapping("/register")
    Map<String, String> registerAnUser(
                                       @RequestParam("name") String name,
                                       @RequestParam("firstname") String firstname,
                                       @RequestParam("email") String email,
                                       @RequestParam("password") String password,
                                       @RequestParam("picture") MultipartFile carteVitale){
        return authService.createUser(name, firstname, email, password, carteVitale);
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
