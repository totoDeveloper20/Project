package com.org.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Acteur {
	@Id @GeneratedValue
	Long id;
	String nom;
	String prenom;
	String RaisonSociale;
	String typeActeur;
	String adresse;
	String email;
	String contact;
	String webSite;
	String reseaucxSociaux;
	String experience;
	String detailMetier;
	//List<String> photos=new ArrayList<String>();
	//List<String> videos=new ArrayList<String>();
	public Acteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acteur(String nom, String prenom, String raisonSociale, String typeActeur, String adresse, String email,
			String contact, String webSite, String reseaucxSociaux, String experience, String detailMetier) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		RaisonSociale = raisonSociale;
		this.typeActeur = typeActeur;
		this.adresse = adresse;
		this.email = email;
		this.contact = contact;
		this.webSite = webSite;
		this.reseaucxSociaux = reseaucxSociaux;
		this.experience = experience;
		this.detailMetier = detailMetier;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getRaisonSociale() {
		return RaisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		RaisonSociale = raisonSociale;
	}
	public String getTypeActeur() {
		return typeActeur;
	}
	public void setTypeActeur(String typeActeur) {
		this.typeActeur = typeActeur;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getReseaucxSociaux() {
		return reseaucxSociaux;
	}
	public void setReseaucxSociaux(String reseaucxSociaux) {
		this.reseaucxSociaux = reseaucxSociaux;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getDetailMetier() {
		return detailMetier;
	}
	public void setDetailMetier(String detailMetier) {
		this.detailMetier = detailMetier;
	}
	
}