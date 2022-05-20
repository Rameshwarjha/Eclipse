package com.demo.AOP.ASPECTORIENTEDpROGRAMMING.service;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentServiceIMPL implements PaymentService {
	@Autowired
	public void makePayment() {

		System.out.println("Amount Debited....");
		
		//
		//
		//
		System.out.println("Amount Credited.....");
		
	}
	

}
