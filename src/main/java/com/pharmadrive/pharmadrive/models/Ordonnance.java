package com.pharmadrive.pharmadrive.models;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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

    @Column(name = "date_ordonnance")
    @CreationTimestamp
    private Instant dateOrdonnance;

    @Transient
    private MultipartFile imageOrdonnance;

    @ManyToOne
    @JoinColumn(name = "idCommande", nullable = false)
    private Commande commande;  

}