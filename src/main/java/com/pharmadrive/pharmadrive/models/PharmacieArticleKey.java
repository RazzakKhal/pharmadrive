package com.pharmadrive.pharmadrive.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class PharmacieArticleKey implements Serializable {

    private Long idPharmacie;
    private Long idArticle;

    public PharmacieArticleKey() {}

    public PharmacieArticleKey(Long idPharmacie, Long idArticle) {
        this.idPharmacie = idPharmacie;
        this.idArticle = idArticle;
    }

    // Getters et Setters
    public Long getIdPharmacie() {
        return idPharmacie;
    }

    public void setIdPharmacie(Long idPharmacie) {
        this.idPharmacie = idPharmacie;
    }

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PharmacieArticleKey that = (PharmacieArticleKey) o;
        return Objects.equals(idPharmacie, that.idPharmacie) && Objects.equals(idArticle, that.idArticle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPharmacie, idArticle);
    }
}