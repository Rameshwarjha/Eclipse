package com.demo.AOP.ASPECTORIENTEDpROGRAMMING.Aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.demo.AOP.ASPECTORIENTEDpROGRAMMING.service.PaymentServiceIMPL.makePayment())")
	public void printBefore() {
	System.out.println("Payment Started");
	}
	@After("execution(* com.demo.AOP.ASPECTORIENTEDpROGRAMMING.service.PaymentServiceIMPL.makePayment())")
	public void printAfter() {
		System.out.println("Payment completed");
		
		
	}
	

}
