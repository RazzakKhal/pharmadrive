package com.pharmadrive.pharmadrive.controllers;

import com.pharmadrive.pharmadrive.dtos.toView.PharmacieDto;
import com.pharmadrive.pharmadrive.services.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    PharmacieDto getPharmacy(@PathVariable Long id){
        return pharmacyService.getPharmacy(id);
    }
}
