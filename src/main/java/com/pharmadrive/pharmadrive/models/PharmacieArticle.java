package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "PHARMACIE_ARTICLE")
@Entity
@NoArgsConstructor
@Data
public class PharmacieArticle {

    @EmbeddedId
    private PharmacieArticleKey id;

    @ManyToOne
    @MapsId("idPharmacie")
    @JoinColumn(name = "idPharmacie", nullable = false)
    private Pharmacie pharmacie;

    @ManyToOne
    @MapsId("idArticle")
    @JoinColumn(name = "idArticle", nullable = false)
    private Article article;

    @Column(nullable = false)
    private int quantite;
}
