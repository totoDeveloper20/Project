package com.org.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Metier {
	@Id @GeneratedValue
	Long id;
	String description;
	@OneToMany
	private Collection<ActeurIndividu> acteurIndividu;
	@OneToMany
	private Collection<ActeurOrganisation> acteurOrganisation;
	
	public Metier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Metier(String description, Collection<ActeurIndividu> acteurIndividu,
			Collection<ActeurOrganisation> acteurOrganisation) {
		super();
		this.description = description;
		this.acteurIndividu = acteurIndividu;
		this.acteurOrganisation = acteurOrganisation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
