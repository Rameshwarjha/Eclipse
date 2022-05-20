package com.demo.demoJunitTesting2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demoJunitTesting2.Entity.Person;
import com.demo.demoJunitTesting2.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo repo;
	
	public List<Person>getAllPerson(){
		return this.repo.findAll();
		
	}

	//create at service testing
	public PersonService(PersonRepo repo) {
		super();
		this.repo = repo;
	}
	
	
	
	
	

}
