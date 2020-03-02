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
public class ActeurOrganisation {
	@Id @GeneratedValue
	Long id;
	private String raison_Sociale;
	@ManyToOne
	private Adresses adresse;
	private String email;
	private String contact;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCreation;
	private String StatutEntreprise; 
	private String webSite;
	private String reseaucxSociaux;
	private String photo;
	@ManyToOne
	private Metier metiers;;
	private String video;
	public ActeurOrganisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ActeurOrganisation(String raison_Sociale, Adresses adresse, String email, String contact, Date dateCreation,
			String statutEntreprise, String webSite, String reseaucxSociaux, String photo, Metier metiers,
			String video) {
		super();
		this.raison_Sociale = raison_Sociale;
		this.adresse = adresse;
		this.email = email;
		this.contact = contact;
		this.dateCreation = dateCreation;
		StatutEntreprise = statutEntreprise;
		this.webSite = webSite;
		this.reseaucxSociaux = reseaucxSociaux;
		this.photo = photo;
		this.metiers = metiers;
		this.video = video;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRaison_Sociale() {
		return raison_Sociale;
	}
	public void setRaison_Sociale(String raison_Sociale) {
		this.raison_Sociale = raison_Sociale;
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
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getStatutEntreprise() {
		return StatutEntreprise;
	}
	public void setStatutEntreprise(String statutEntreprise) {
		StatutEntreprise = statutEntreprise;
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
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	



	
}
