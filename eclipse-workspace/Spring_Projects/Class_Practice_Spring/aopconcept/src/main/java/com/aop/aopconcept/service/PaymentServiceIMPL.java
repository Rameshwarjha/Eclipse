package com.aop.aopconcept.service;

public class PaymentServiceIMPL implements PaymentService {

	public void makePayment(int amount) {
		
		System.out.println(amount + " Amount debited...");
		
		System.out.println(amount + " Amount credited...");
		
		 
	}

}
