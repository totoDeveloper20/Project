package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.AuthentificationCompte;



public interface CompteActeurRepository extends JpaRepository<AuthentificationCompte, Long> {

}
