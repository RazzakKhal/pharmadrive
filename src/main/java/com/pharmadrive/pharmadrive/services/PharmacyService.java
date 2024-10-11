package com.pharmadrive.pharmadrive.services;

import com.pharmadrive.pharmadrive.dtos.toView.PharmacieDto;

import java.util.List;

public interface PharmacyService {

    List<PharmacieDto> getAllPharmacies();

    PharmacieDto getPharmacy(Long id);
}
