package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "ORDONNANCE")
@Entity
@NoArgsConstructor
@Data
public class Ordonnance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdonnance;


    private String imageOrdonnance;

    @ManyToOne
    @JoinColumn(name = "idCommande", nullable = true)
    private Commande commande;  

}