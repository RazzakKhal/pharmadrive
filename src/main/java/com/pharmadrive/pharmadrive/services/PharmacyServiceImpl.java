package com.pharmadrive.pharmadrive.services;

import com.pharmadrive.pharmadrive.dtos.toView.PharmacieDto;
import com.pharmadrive.pharmadrive.mappers.PharmacieMapper;
import com.pharmadrive.pharmadrive.models.Pharmacie;
import com.pharmadrive.pharmadrive.repositories.PharmacieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService{

    @Autowired
    PharmacieRepository pharmacieRepository;

    @Autowired
    PharmacieMapper pharmacieMapper;


    @Override
    public List<PharmacieDto> getAllPharmacies() {

        List<Pharmacie> pharmacies = pharmacieRepository.findAll();

        return pharmacieMapper.toDto(pharmacies);
    }
}
