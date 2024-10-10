package com.pharmadrive.pharmadrive.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmadrive.pharmadrive.dtos.toView.OrdonnanceCommandeUserDto;
import com.pharmadrive.pharmadrive.services.OrdonnanceCommandeUserService;
@CrossOrigin
@RestController
@RequestMapping("/api/ordonnances-commandes-users")
public class OrdonnanceCommandeUserController {

    private final OrdonnanceCommandeUserService ordonnanceCommandeUserService;

    @Autowired
    public OrdonnanceCommandeUserController(OrdonnanceCommandeUserService ordonnanceCommandeUserService) {
        this.ordonnanceCommandeUserService = ordonnanceCommandeUserService;
    }

    @GetMapping("/details")
    public ResponseEntity<Map<String, OrdonnanceCommandeUserDto>> getOrdonnanceCommandeUserDetails() {
        Map<String, OrdonnanceCommandeUserDto> details = ordonnanceCommandeUserService.getOrdonnanceCommandeUserDetails();
        return ResponseEntity.ok(details);
    }
}
