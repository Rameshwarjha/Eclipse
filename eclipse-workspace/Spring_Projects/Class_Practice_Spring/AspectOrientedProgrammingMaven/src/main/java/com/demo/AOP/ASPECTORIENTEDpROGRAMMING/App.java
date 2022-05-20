package com.demo.AOP.ASPECTORIENTEDpROGRAMMING;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.AOP.ASPECTORIENTEDpROGRAMMING.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/AOP/ASPECTORIENTEDpROGRAMMING/Config.xml");
        
        PaymentService paymentObj= context.getBean("payment",PaymentService.class);
        
        paymentObj.makePayment();
    }
}
