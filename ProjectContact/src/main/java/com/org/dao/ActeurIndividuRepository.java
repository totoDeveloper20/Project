package com.org.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.ActeurIndividu;


public interface ActeurIndividuRepository extends JpaRepository<ActeurIndividu, Long> {

	public Page<ActeurIndividu> findByNomContains(String nom1, Pageable pageable);
	
}
