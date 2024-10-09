package com.pharmadrive.pharmadrive.mappers;

import com.pharmadrive.pharmadrive.dtos.toView.PharmacieDto;
import com.pharmadrive.pharmadrive.models.Pharmacie;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PharmacieMapper {
    public PharmacieDto toDto(Pharmacie pharmacie){
        if(pharmacie == null){
            return null;
        }
        PharmacieDto pharmacieDto = new PharmacieDto();

        pharmacieDto.setNumero(pharmacie.getNumero());
        pharmacieDto.setNomPharmacie(pharmacie.getNomPharmacie());
        pharmacieDto.setAdressPharmacie(pharmacie.getAdressPharmacie());
        pharmacieDto.setId(pharmacie.getId());
        pharmacieDto.setPicture(pharmacie.getPicture());

        return pharmacieDto;
    }

    public List<PharmacieDto> toDto(List<Pharmacie> pharmacies) {
        if (pharmacies == null || pharmacies.isEmpty()) {
            return Collections.emptyList();
        }
        return pharmacies.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
