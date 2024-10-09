package com.pharmadrive.pharmadrive.services;

import java.util.Map;

import com.pharmadrive.pharmadrive.dtos.toView.PrescriptionDto;
import org.springframework.web.multipart.MultipartFile;

import com.pharmadrive.pharmadrive.models.Ordonnance;

public interface PrescriptionService {
    public Map<String, PrescriptionDto> createPrescription(MultipartFile imageOrdonnance);
}
