package com.pharmadrive.pharmadrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmadrive.pharmadrive.models.Ordonnance;

@Repository
public interface OrdonnanceRepository extends JpaRepository<Ordonnance, Long> {

}
