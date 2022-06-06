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
        
        
        // after giving dependencies only it will give the option to import so first 
//        provide dependencies 
       ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

       Student st = (Student)context.getBean("stu1");
       System.out.println(st); 
       
    }
    
}
