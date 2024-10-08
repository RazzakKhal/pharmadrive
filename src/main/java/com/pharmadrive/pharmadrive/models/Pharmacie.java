package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "PHARMACIE")
@Entity
@NoArgsConstructor
@Data
public class Pharmacie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adressPharmacie", nullable = false)
    private String adressPharmacie;

    @Column(name = "nomPharmacie", nullable = false)
    private String nomPharmacie;

    @Column(name = "numero", nullable = false)
    private String numero;  

}