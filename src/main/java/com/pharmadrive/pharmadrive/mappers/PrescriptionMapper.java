package com.pharmadrive.pharmadrive.mappers;

import org.springframework.stereotype.Component;

import com.pharmadrive.pharmadrive.dtos.toView.PrescriptionDto;
import com.pharmadrive.pharmadrive.models.Ordonnance;

@Component
public class PrescriptionMapper {

    public Ordonnance toEntity(PrescriptionDto prescriptionDto) {
        if (prescriptionDto == null) {
            return null;
        }
        Ordonnance ordonnance = new Ordonnance();
        ordonnance.setImageOrdonnance(prescriptionDto.getImageOrdonnance());

        return ordonnance;
    }

    public PrescriptionDto toDto(Ordonnance ordonnance) {
        if (ordonnance == null) {
            return null;
        }
        PrescriptionDto prescriptionDto = new PrescriptionDto();
        prescriptionDto.setImageOrdonnance(ordonnance.getImageOrdonnance());

        return prescriptionDto;
    }
}
