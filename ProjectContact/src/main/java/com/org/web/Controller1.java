package com.org.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.dao.ActeurIndividuRepository;
import com.org.entities.ActeurIndividu;
import com.org.entities.Adresses;





@Controller
public class Controller1 {

	@Autowired
	private ActeurIndividuRepository individuRepository;
	
	@GetMapping (value = "/index")
	public String ListeContacts (Model model, @RequestParam(name="page", defaultValue = "0") int page, 
		@RequestParam(name="nom1", defaultValue = "") String nom1) {
		Page<ActeurIndividu> Pageindividus=individuRepository.findByNomContains(nom1, PageRequest.of(page, 5));
		model.addAttribute("acteurs", Pageindividus.getContent());
		model.addAttribute("pages", new int[Pageindividus.getTotalPages()]);
		model.addAttribute("currentPage", page);
		return "list";
				
	}
	

	
	
	@RequestMapping (value = "/index2", method=RequestMethod.GET)
	public String formParticulier(Model model) {
	model.addAttribute("individuInscription", new ActeurIndividu());
					
		return "inscriptionParticuler";
					
	}

	
	@RequestMapping (value = "/saveParticulier", method=RequestMethod.POST)
	public String save(ActeurIndividu act) {
	individuRepository.save(act);
					
		return "inscriptionParticuler";
					
	}
	
		
	
	
	
}
