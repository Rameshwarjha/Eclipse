package com.demo.springcore.Hello_world_maven_Project;

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
        
       ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

       Student st = (Student)context.getBean("stu1");
       System.out.println(st);
       
    }
    
}
