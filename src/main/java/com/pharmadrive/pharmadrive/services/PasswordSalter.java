package com.pharmadrive.pharmadrive.services;

public interface PasswordSalter {
    String saltPassword(String password);
}
