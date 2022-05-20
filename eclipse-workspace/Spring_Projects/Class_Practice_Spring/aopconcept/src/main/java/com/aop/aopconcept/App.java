package com.aop.aopconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.aopconcept.service.PaymentService;

/**
 * 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/aop/aopconcept/config.xml");
    
    	PaymentService paymentObject = context.getBean("payment", PaymentService.class);
    
    	//auth, print:PaymentStarted
    	paymentObject.makePayment(542);
    
    }
}


/*
 *dependencies 
 *1. spring core 
 *2. spring context
 *
 *3. spring aop
 *4. springjrt
 *5. aspectjweaver
 *
 */