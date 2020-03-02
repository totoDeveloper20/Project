package com.org.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class ActeurIndividu {
	@Id @GeneratedValue
	Long id;
	private String nom;
	private String prenom;
	@ManyToOne
	private Adresses adresse;
	private String email;
	private String contact;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateNaissance;
	private String webSite;
	private String reseauxSociaux;
	private String photo;
	@ManyToOne
	private Metier metiers;
	private String experience;
	private String video;
	public ActeurIndividu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ActeurIndividu(String nom, String prenom, Adresses adresse, String email, String contact, Date dateNaissance,
			String webSite, String reseauxSociaux, String photo,  Metier metiers, String experience, String video) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.contact = contact;
		this.dateNaissance = dateNaissance;
		this.webSite = webSite;
		this.reseauxSociaux = reseauxSociaux;
		this.photo = photo;
		this.metiers = metiers;
		this.experience = experience;
		this.video = video;
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
	public Adresses getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresses adresse) {
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getReseauxSociaux() {
		return reseauxSociaux;
	}
	public void setReseauxSociaux(String reseauxSociaux) {
		this.reseauxSociaux = reseauxSociaux;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Metier getMetiers() {
		return metiers;
	}
	public void setMetiers(Metier metiers) {
		this.metiers = metiers;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
}