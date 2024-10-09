package com.pharmadrive.pharmadrive.services;

import com.pharmadrive.pharmadrive.dtos.fromView.LoginUserDto;
import com.pharmadrive.pharmadrive.dtos.toView.UserDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface AuthService {
    public Map<String, String> createUser(String name,
                                          String firstname,
                                          String email,
                                          String password,
                                          MultipartFile carteVitale);

    public Map<String, String> loginUser(LoginUserDto loginUserDto);

    UserDto getMe(Object principal);
}
