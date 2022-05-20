package com.demo.SpringBootMongoDBEX.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootMongoDBEX.Exception.BusinessException;
import com.demo.SpringBootMongoDBEX.Repo.CustRepo;
import com.demo.SpringBootMongoDBEX.model.Customer;


@Service
public class CustServiceIMPL implements CustService {
	
	@Autowired
	private CustRepo custRepo;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		if(customer.getCustName().isEmpty()||customer.getCustName().length()==0) {
		throw new BusinessException("601","Please Enter Proper Name");
		
		}
		try {
		custRepo.save(customer);
		return customer;
		}catch(Exception e) {
			
		}
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		custRepo.save(customer);
		return customer;
		
	}

	@Override
	public void deleteCustomer(int custId) {
		// TODO Auto-generated method stub
		
		custRepo.deleteById(custId);
		
	}

}
