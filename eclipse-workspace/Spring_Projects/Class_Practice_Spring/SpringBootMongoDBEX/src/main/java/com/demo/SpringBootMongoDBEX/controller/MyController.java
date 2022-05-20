package com.demo.SpringBootMongoDBEX.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootMongoDBEX.model.Customer;
import com.demo.SpringBootMongoDBEX.service.CustServiceIMPL;

@RestController
public class MyController {
	@Autowired
	private CustServiceIMPL csi;
	
	@GetMapping("/customer")
	public List<Customer> getCustomer(){
		return this.csi.getCustomer();
		
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.csi.addCustomer(customer);
	}
	
	@PutMapping("/customer/{custId}")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.csi.updateCustomer(customer);
	}
	
	@DeleteMapping("/customer/{custId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable int custId){
		try {
			this.csi.deleteCustomer(custId);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
	

}
