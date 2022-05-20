package com.demo.authentication.SecurityUsingAwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityUsingAwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityUsingAwtApplication.class, args);
	}

}
/* we need this "Tomcat jasper" to run the jsp files */
//  ***Tomcat Jasper****
//It is used to show jsp files as without this the page will get downloaded
//https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jasper 


//*** spring-boot-starter-security *** 
//for enabling the security "authentication"
//https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security 

/* it gives us this message with a temporary password
 * 
 * ["Using generated security password: e5a6f23d-0a04-42eb-9905-fda2249fd549
This generated password is for development use only. Your security configuration must be updated before running your application in production.
"]
 * */ 
 