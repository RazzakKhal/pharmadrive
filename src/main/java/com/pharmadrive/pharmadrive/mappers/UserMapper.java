package com.pharmadrive.pharmadrive.mappers;

import com.pharmadrive.pharmadrive.dtos.fromView.LoginUserDto;
import com.pharmadrive.pharmadrive.dtos.toView.UserDto;
import com.pharmadrive.pharmadrive.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {


    public User toEntity(LoginUserDto loginUserDto){
        if(loginUserDto == null){
            return null;
        }
        User user = new User();
        user.setEmail(loginUserDto.getEmail());
        user.setPassword(loginUserDto.getPassword());

        return user;
    }

    public UserDto toDto(User user){
        if(user == null){
            return null;
        }
        UserDto userDto = new UserDto();

        userDto.setCreatedAt(user.getCreatedAt());
        userDto.setUpdatedAt(user.getUpdatedAt());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setId(user.getId());

        return userDto;
    }
}
