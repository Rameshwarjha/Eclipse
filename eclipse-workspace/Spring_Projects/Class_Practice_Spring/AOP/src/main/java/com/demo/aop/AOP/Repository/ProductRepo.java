package com.demo.aop.AOP.Repository;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;


//import lombok.extern.java.Log;
//import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProductRepo {
	
	public String getProductName() {
		
        
		log.info("Received request for product");
		return "Product  -test";
		
		
	}

}
