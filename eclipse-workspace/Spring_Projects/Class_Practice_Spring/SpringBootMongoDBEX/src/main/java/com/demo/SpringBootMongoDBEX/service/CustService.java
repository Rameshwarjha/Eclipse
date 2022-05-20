package com.demo.SpringBootMongoDBEX.service;

import java.util.List;

import com.demo.SpringBootMongoDBEX.model.Customer;

public interface CustService {

	public List<Customer> getCustomer();
	
	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(int custId);
}
