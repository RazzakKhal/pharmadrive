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

@Table(name = "ARTICLE_COMMANDE")
@Entity
@NoArgsConstructor
@Data
public class ArticleCommande {

    @EmbeddedId
    private ArticleCommandeKey id;

    @ManyToOne
    @MapsId("idArticle")
    @JoinColumn(name = "id_article", nullable = false)
    private Article article;

    @ManyToOne
    @MapsId("idCommande")
    @JoinColumn(name = "id_commande", nullable = false)
    private Commande commande;

    @Column(nullable = false)
    private int quantite;
}