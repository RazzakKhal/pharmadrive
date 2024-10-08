package com.pharmadrive.pharmadrive.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class ArticleCommandeKey implements Serializable {

    private Long idArticle;
    private Long idCommande;

    public ArticleCommandeKey() {}

    public ArticleCommandeKey(Long idArticle, Long idCommande) {
        this.idArticle = idArticle;
        this.idCommande = idCommande;
    }

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleCommandeKey that = (ArticleCommandeKey) o;
        return Objects.equals(idArticle, that.idArticle) && Objects.equals(idCommande, that.idCommande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, idCommande);
    }
}