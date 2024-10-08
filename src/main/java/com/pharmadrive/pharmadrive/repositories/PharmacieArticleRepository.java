package com.pharmadrive.pharmadrive.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmadrive.pharmadrive.models.PharmacieArticle;
import com.pharmadrive.pharmadrive.models.PharmacieArticleKey;

@Repository
public interface PharmacieArticleRepository extends JpaRepository<PharmacieArticle, PharmacieArticleKey> {
    List<PharmacieArticle> findByPharmacie_Id(Long pharmacieId);
}
