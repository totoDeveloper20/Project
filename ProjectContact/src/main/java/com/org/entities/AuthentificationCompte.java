package com.org.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AuthentificationCompte {
	@Id @GeneratedValue
	Long id;
	String login;
	String pwd;
	
	

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "LOGIN", unique=true, insertable=true, updatable=true, nullable=false)
    private String login;
    
    @Column(name = "USER_PASSWORD", insertable=true, updatable=true, nullable=false)
    private String password;
    
    @Column(name = "USER_ACTIVE", insertable=true, updatable = true, nullable=false)
    private Integer active;
    
    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles= new HashSet<>();*/
	
	
	
	public AuthentificationCompte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AuthentificationCompte(String login, String pwd) {
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
