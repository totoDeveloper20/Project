package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Metier;

public interface MetierRepository extends JpaRepository<Metier, Long> {

}
