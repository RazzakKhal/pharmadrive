// package com.pharmadrive.pharmadrive.models;

// import java.time.Instant;

// import org.hibernate.annotations.CreationTimestamp;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Table(name = "COMMANDE")
// @Entity
// @NoArgsConstructor
// @Data
// public class Commande {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long idCommande;

//     @Column(name = "date_commande")
//     @CreationTimestamp
//     private Instant dateCommande;

//     @ManyToOne
//     @JoinColumn(name = "idUser", nullable = false)
//     private User user;  

//     @ManyToOne
//     @JoinColumn(name = "idPharmacie", nullable = false)
//     private Pharmacie pharmacie;  

// }