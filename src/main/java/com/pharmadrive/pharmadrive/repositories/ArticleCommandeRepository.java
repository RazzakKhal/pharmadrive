package com.pharmadrive.pharmadrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmadrive.pharmadrive.models.ArticleCommande;
import com.pharmadrive.pharmadrive.models.ArticleCommandeKey;

@Repository
public interface ArticleCommandeRepository extends JpaRepository<ArticleCommande, ArticleCommandeKey> {

}
