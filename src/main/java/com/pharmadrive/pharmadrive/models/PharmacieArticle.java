package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
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
    @JoinColumn(name = "id_pharmacie", nullable = false)
    private Pharmacie pharmacie;

    @ManyToOne
    @MapsId("idArticle")
    @JoinColumn(name = "id_article", nullable = false)
    private Article article;

    @Column(nullable = false)
    private int quantite;
}