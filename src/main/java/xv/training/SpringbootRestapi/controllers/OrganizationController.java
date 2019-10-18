package xv.training.SpringbootRestapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.SpringbootRestapi.entities.Organization;
import xv.training.SpringbootRestapi.repositories.OrganizaitonRepository;

@RestController
public class OrganizationController {
	@Autowired
	private OrganizaitonRepository organizaitonRepository;
	
	@RequestMapping("/organizations")
	private Iterable<Organization> getOrganizations(){
		return organizaitonRepository.findAll();
		
	}

}
