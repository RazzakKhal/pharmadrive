package com.pharmadrive.pharmadrive.services;

import java.io.IOException;
import java.util.Map;

import com.pharmadrive.pharmadrive.dtos.toView.PrescriptionDto;
import com.pharmadrive.pharmadrive.mappers.PrescriptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import com.pharmadrive.pharmadrive.models.Ordonnance;
import com.pharmadrive.pharmadrive.repositories.OrdonnanceRepository;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{


    @Autowired
    ImageService imageService;
    @Autowired
    OrdonnanceRepository ordonnanceRepository;

    @Autowired
    PrescriptionMapper prescriptionMapper;

    @Value("${api.url}")
    private String APPLICATION_URL;

    @Override
    public Map<String, PrescriptionDto> createPrescription(MultipartFile imageOrdonnance){
        Ordonnance ordonnance= new Ordonnance();
        // gérer le traitement de l'ordonnance
        try{
            String imageUrl = imageService.saveFileOnServerAndReturnFileUrl(imageOrdonnance);
            ordonnance.setImageOrdonnance(APPLICATION_URL + imageUrl);
        }catch(IOException exception){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "oops problème dans le traitement de l'image");
        }

        ordonnanceRepository.save(ordonnance);
        return Map.of("ordonnance", prescriptionMapper.toDto(ordonnance));
    }

}