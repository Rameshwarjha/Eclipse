package com.demo.demoJunitTesting2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demoJunitTesting2.service.PersonService;

@RestController
public class MyController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public ResponseEntity<?> getAllPersons(){
		return ResponseEntity.ok(this.personService.getAllPerson());
	}

	
}
