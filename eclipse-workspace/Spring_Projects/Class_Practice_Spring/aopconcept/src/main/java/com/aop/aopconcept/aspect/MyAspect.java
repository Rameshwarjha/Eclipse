package com.aop.aopconcept.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	//when arguments are passed inside the actual methods
	
	@Before("execution(* com.aop.aopconcept.service.PaymentServiceIMPL.makePayment(..))")
	public void printBefore() {
		System.out.println("Payment started...");
		
	}
	
	@After("execution(* com.aop.aopconcept.service.PaymentServiceIMPL.makePayment(..))")
	public void printAfter() {
		System.out.println("Payment done...");
		
	}
	
	//without any argument - when actual method does not have any arguments passed
	
	
//	@Before("execution(* com.aop.aopconcept.service.PaymentServiceIMPL.makePayment())")
//	public void printBefore() {
//		System.out.println("Payment started...");
//		
//	}
//	
//	@After("execution(* com.aop.aopconcept.service.PaymentServiceIMPL.makePayment())")
//	public void printAfter() {
//		System.out.println("Payment done...");
//		
//	}

}
