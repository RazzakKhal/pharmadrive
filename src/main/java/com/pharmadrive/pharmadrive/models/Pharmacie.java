package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "PHARMACIE")
@Entity
@NoArgsConstructor
@Data
public class Pharmacie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPharmacie;

    @Column(name = "adressPharmacie", nullable = false)
    private String adressPharmacie;

    @Column(name = "nomPharmacie", nullable = false)
    private String nomPharmacie;

    @Column(name = "numero", nullable = false)
    private String numero;  

}
