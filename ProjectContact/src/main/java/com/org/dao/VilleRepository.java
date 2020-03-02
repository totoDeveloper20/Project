package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Ville;

public interface VilleRepository extends JpaRepository<Ville, Long> {

}
