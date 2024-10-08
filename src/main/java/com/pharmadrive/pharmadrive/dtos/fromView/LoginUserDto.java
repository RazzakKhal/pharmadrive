package com.pharmadrive.pharmadrive.dtos.fromView;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginUserDto {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
