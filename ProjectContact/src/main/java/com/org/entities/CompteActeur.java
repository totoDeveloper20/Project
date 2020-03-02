package com.org.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CompteActeur {
	@Id @GeneratedValue
	Long id;
	String login;
	String pwd;
	
	
	public CompteActeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CompteActeur(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
