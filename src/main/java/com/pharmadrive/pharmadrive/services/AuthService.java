package com.pharmadrive.pharmadrive.services;

import com.pharmadrive.pharmadrive.dtos.fromView.LoginUserDto;
import com.pharmadrive.pharmadrive.dtos.fromView.RegisterUserDto;
import com.pharmadrive.pharmadrive.dtos.toView.UserDto;

import java.util.Map;

public interface AuthService {
    public Map<String, String> createUser(RegisterUserDto registerUserDto);

    public Map<String, String> loginUser(LoginUserDto loginUserDto);

    UserDto getMe(Object principal);
}
