package com.pharmadrive.pharmadrive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharmadrive.pharmadrive.models.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
