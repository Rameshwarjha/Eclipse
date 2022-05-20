package com.demo.spring.CustInfo___Developing_Backend_application_using_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // after giving dependencies only it will give the option to import so first 
//        provide dependencies 
        ApplicationContext context = new ClassPathXmlApplicationContext("Config1.xml");
        
        Cust cs = (Cust)context.getBean("cust1");
        System.out.println(cs);
    }
}
                    