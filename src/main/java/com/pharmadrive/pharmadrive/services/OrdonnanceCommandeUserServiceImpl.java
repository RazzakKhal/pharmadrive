package com.pharmadrive.pharmadrive.services;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.pharmadrive.pharmadrive.dtos.toView.OrdonnanceCommandeUserDto;
import com.pharmadrive.pharmadrive.mappers.OrdonnanceCommandeUserMapper;
import com.pharmadrive.pharmadrive.repositories.CommandeRepository;
import com.pharmadrive.pharmadrive.repositories.OrdonnanceRepository;
import com.pharmadrive.pharmadrive.repositories.UserRepository;

@Service
public class OrdonnanceCommandeUserServiceImpl implements OrdonnanceCommandeUserService {

    private final OrdonnanceRepository ordonnanceRepository;
    private final CommandeRepository commandeRepository;
    private final UserRepository userRepository;
    private final OrdonnanceCommandeUserMapper ordonnanceCommandeUserMapper;

    public OrdonnanceCommandeUserServiceImpl(OrdonnanceRepository ordonnanceRepository, 
                                             CommandeRepository commandeRepository, 
                                             UserRepository userRepository, 
                                             OrdonnanceCommandeUserMapper ordonnanceCommandeUserMapper) {
        this.ordonnanceRepository = ordonnanceRepository;
        this.commandeRepository = commandeRepository;
        this.userRepository = userRepository;
        this.ordonnanceCommandeUserMapper = ordonnanceCommandeUserMapper;
    }

    @Override
    public Map<String, OrdonnanceCommandeUserDto> getOrdonnanceCommandeUserDetails() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getOrdonnanceCommandeUserDetails'");
    }

   
}
