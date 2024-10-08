package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;

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
