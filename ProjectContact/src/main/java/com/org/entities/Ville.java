package com.org.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ville {
	@Id @GeneratedValue
	Long id;
	String nom;
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ville(String nom) {
		super();
		this.nom = nom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}



	
}