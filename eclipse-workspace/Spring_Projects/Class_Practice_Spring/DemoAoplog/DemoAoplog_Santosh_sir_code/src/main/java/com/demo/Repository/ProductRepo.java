package com.demo.Repository;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProductRepo {
	
	public String getProductName() {
		log.info("Recived request for product name");
		return "Product -test";
	}

}
