package com.pharmadrive.pharmadrive.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "ARTICLE")
@Entity
@NoArgsConstructor
@Data
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;

    @Column(name = "nomArticle", nullable = false)
    private String nomArticle;

    @Column(name = "prixArticle", nullable = false)
    private double prixArticle;

}
