public package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.*;
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
    @JoinColumn(name = "idArticle", nullable = false)
    private Article article;

    @ManyToOne
    @MapsId("idCommande")
    @JoinColumn(name = "idCommande", nullable = false)
    private Commande commande;

    @Column(nullable = false)
    private int quantite;
}
 {
    
}
