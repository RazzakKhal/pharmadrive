package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Table(name = "COMMANDE")
@Entity
@NoArgsConstructor
@Data
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;

    @Column(name = "date_commande")
    @CreationTimestamp
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private User user;  

    @ManyToOne
    @JoinColumn(name = "idPharmacie", nullable = false)
    private Pharmacie pharmacie;  

}
