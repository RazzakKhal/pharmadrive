package com.pharmadrive.pharmadrive.services;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.pharmadrive.pharmadrive.models.Ordonnance;

public interface PrescriptionService {
    public Map<String, Ordonnance> createPrescription(MultipartFile imageOrdonnance);
}
