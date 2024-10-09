package com.pharmadrive.pharmadrive.controllers;

import java.util.Map;

import com.pharmadrive.pharmadrive.dtos.toView.PrescriptionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pharmadrive.pharmadrive.models.Ordonnance;
import com.pharmadrive.pharmadrive.services.PrescriptionService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;

    @PostMapping("/prescription")
    Map<String, PrescriptionDto> registerAPrescription(@RequestParam("picture") MultipartFile imageOrdonnance){
        return prescriptionService.createPrescription(imageOrdonnance);
    }
}