package com.demo.spring.Auto_wiring_maven;

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
        
        /*****  SEE HOW PATH IS TAKEN IT IS STARTED FROM THE PACKAGE LOCATION  ***/
        ApplicationContext context= new ClassPathXmlApplicationContext("com/demo/spring/Auto_wiring_maven/Autoconfig.xml");
        Emp emp1= context.getBean("emp1", Emp.class);
        System.out.println(emp1);
        
        Emp emp2= context.getBean("emp2",Emp.class);
        System.out.println(emp2);
    }
}
