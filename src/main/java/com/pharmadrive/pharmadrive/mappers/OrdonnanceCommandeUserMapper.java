package com.pharmadrive.pharmadrive.mappers;

import org.springframework.stereotype.Component;

import com.pharmadrive.pharmadrive.dtos.toView.OrdonnanceCommandeUserDto;
import com.pharmadrive.pharmadrive.models.Commande;
import com.pharmadrive.pharmadrive.models.Ordonnance;
import com.pharmadrive.pharmadrive.models.User;

@Component
public class OrdonnanceCommandeUserMapper {

    // Mapping from entities (Ordonnance, Commande, User) to DTO
    public OrdonnanceCommandeUserDto toDto(Ordonnance ordonnance, Commande commande, User user) {
        if (ordonnance == null || commande == null || user == null) {
            return null;
        }

        OrdonnanceCommandeUserDto dto = new OrdonnanceCommandeUserDto();
        dto.setId(ordonnance.getIdOrdonnance());
        dto.setCarteVitaleUser(user.getCarteVitale());  
        dto.setDateCommande(commande.getDateCommande());  
        dto.setNameUser(user.getName());
        dto.setFirstNameUser(user.getFirstname());

        return dto;
    }
}
