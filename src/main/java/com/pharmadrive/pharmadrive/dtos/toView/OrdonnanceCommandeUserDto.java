package com.pharmadrive.pharmadrive.dtos.toView;
import java.time.Instant;


public class OrdonnanceCommandeUserDto {
    private Long idOrdonnance;
    private String carteVitale;
    private Instant dateCommande;
    private String name;
    private String firstname;

    public OrdonnanceCommandeUserDto() {
    }

    public Long getId() {
        return idOrdonnance;
    }

    public void setId(Long id) {
        this.idOrdonnance = id;
    }

    public String getCarteVitaleUser() {
        return carteVitale;
    }

    public void setCarteVitaleUser(String carteVitale) {
        this.carteVitale = carteVitale;
    }

    public Instant getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Instant dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getNameUser() {
        return name;
    }

    public void setNameUser(String name) {
        this.name = name;
    }

    public String getFirstNameUser() {
        return firstname;
    }

    public void setFirstNameUser(String firstname) {
        this.firstname = firstname;
    }


}
