package com.org.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Adresses {
	@Id @GeneratedValue
	Long id;
	String adresse;
	String complementAdresse;
	String codePostal;
	String ville;
	@OneToMany
	private Collection<ActeurIndividu> acteurIndividu;
	@OneToMany
	private Collection<ActeurOrganisation> acteurOrganisation;
	
	
	public Adresses() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Adresses(String adresse, String complementAdresse, String codePostal, String ville,
			Collection<ActeurIndividu> acteurIndividu, Collection<ActeurOrganisation> acteurOrganisation) {
		super();
		this.adresse = adresse;
		this.complementAdresse = complementAdresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.acteurIndividu = acteurIndividu;
		this.acteurOrganisation = acteurOrganisation;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getComplementAdresse() {
		return complementAdresse;
	}


	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public Collection<ActeurIndividu> getActeurIndividu() {
		return acteurIndividu;
	}


	public void setActeurIndividu(Collection<ActeurIndividu> acteurIndividu) {
		this.acteurIndividu = acteurIndividu;
	}


	public Collection<ActeurOrganisation> getActeurOrganisation() {
		return acteurOrganisation;
	}


	public void setActeurOrganisation(Collection<ActeurOrganisation> acteurOrganisation) {
		this.acteurOrganisation = acteurOrganisation;
	}
	
	
	
	
	
	
	
}
