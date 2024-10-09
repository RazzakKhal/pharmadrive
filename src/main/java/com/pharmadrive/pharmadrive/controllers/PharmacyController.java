package com.pharmadrive.pharmadrive.controllers;

import com.pharmadrive.pharmadrive.dtos.toView.PharmacieDto;
import com.pharmadrive.pharmadrive.services.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/pharmacy")
public class PharmacyController {

    @Autowired
    PharmacyService pharmacyService;

    @GetMapping("")
    List<PharmacieDto> getAllPharmacies(){
    return pharmacyService.getAllPharmacies();
    }
}
