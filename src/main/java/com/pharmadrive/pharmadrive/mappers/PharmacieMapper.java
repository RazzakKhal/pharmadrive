package com.pharmadrive.pharmadrive.mappers;

import com.pharmadrive.pharmadrive.dtos.toView.PharmacieDto;
import com.pharmadrive.pharmadrive.models.Pharmacie;
import org.springframework.stereotype.Component;

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


        return pharmacieDto;
    }
}
