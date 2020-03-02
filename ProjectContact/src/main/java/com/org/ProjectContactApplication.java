package com.org;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.org.dao.ActeurIndividuRepository;
import com.org.dao.ActeurOrganisationRepository;
import com.org.entities.ActeurIndividu;
import com.org.entities.ActeurOrganisation;
import com.org.entities.Adresses;
import com.org.entities.Metier;




@SpringBootApplication
public class ProjectContactApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectContactApplication.class, args);
	}

	@Autowired
	private ActeurIndividuRepository individuRepository;
	@Autowired
	private ActeurOrganisationRepository organisationRepository;
	
	
	
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		
		individuRepository.save(new ActeurIndividu("ryu", "ken", null, "email", "contact", null, "webSite", "eseauxSociaux", "photo", null, "experience", "video"));
		
		individuRepository.save(new ActeurIndividu("link", "zelda", null, "email", "contact", null, "webSite", "eseauxSociaux", "photo", null, "experience", "video"));
		
		individuRepository.save(new ActeurIndividu("mario", "luigi", null, "email", "contact", null, "webSite", "eseauxSociaux", "photo", null, "experience", "video"));
		
		individuRepository.save(new ActeurIndividu("carlos", "xamp", null, "email", "contact", null, "webSite", "eseauxSociaux", "photo", null, "experience", "video"));
		
		individuRepository.save(new ActeurIndividu("javaEE", "DONCKYKONG", null, "email", "contact", null, "webSite", "eseauxSociaux", "photo", null, "experience", "video"));
		
		individuRepository.save(new ActeurIndividu("SANGOKU", "VEGETA", null, "email", "contact", null, "webSite", "eseauxSociaux", "photo", null, "experience", "video"));
		
		individuRepository.save(new ActeurIndividu("SONGOHAN", "SANGOTEN", null, "email", "contact", null, "webSite", "eseauxSociaux", "photo", null, "experience", "video"));
		
		
		
		
		
		
		
		
		
		
	}
	

}