package com.pharmadrive.pharmadrive.services;

import java.util.Map;

public interface AuthService {
    public Map<String, String> createUser(RegisterUserDto registerUserDto);

    public Map<String, String> loginUser(LoginUserDto loginUserDto);

    UserDto getMe(Object principal);
}
