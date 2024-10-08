package com.pharmadrive.pharmadrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmadrive.pharmadrive.models.Pharmacie;

@Repository
public interface PharmacieRepository extends JpaRepository<Pharmacie, Long> {

}
