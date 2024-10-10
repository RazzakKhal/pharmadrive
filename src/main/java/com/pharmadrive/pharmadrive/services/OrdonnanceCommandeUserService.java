package com.pharmadrive.pharmadrive.services;

import java.util.Map;

import com.pharmadrive.pharmadrive.dtos.toView.OrdonnanceCommandeUserDto;


public interface OrdonnanceCommandeUserService {
    public Map<String, OrdonnanceCommandeUserDto> getOrdonnanceCommandeUserDetails();
}
