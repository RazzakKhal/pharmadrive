package com.pharmadrive.pharmadrive.mappers;

import com.pharmadrive.pharmadrive.dtos.fromView.LoginUserDto;
import com.pharmadrive.pharmadrive.dtos.toView.UserDto;
import com.pharmadrive.pharmadrive.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    PharmacieMapper pharmacieMapper;

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
        userDto.setRole(user.getRole());
        userDto.setId(user.getId());

        if(user.getPharmacie() != null){
            userDto.setPharmacie(pharmacieMapper.toDto(user.getPharmacie()));
        }

        return userDto;
    }
}
