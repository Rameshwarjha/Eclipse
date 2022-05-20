package com.demo.aop.AOP.Service;

import org.springframework.stereotype.Service;

import com.demo.aop.AOP.Repository.ProductRepo;


import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class ProductService {
	
	private ProductRepo repo;
	
	public String getProductName() {
		log.info("Received request for product name");
		return repo.getProductName();
	}

}
