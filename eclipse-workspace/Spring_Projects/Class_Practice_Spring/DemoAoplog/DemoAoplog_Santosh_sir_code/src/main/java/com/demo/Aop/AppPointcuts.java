package com.demo.Aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppPointcuts {
	
	
	@Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
	public void controllerPointcuts() {
		
	}
	
	@Pointcut("within(@org.springframework.stereotype.Service *)")
	public void servicePointcuts() {
		
	}
	
	@Pointcut("within(@org.springframework.stereotype.Repository *)")
	public void repositoryPointcuts() {
		
	}
	@Pointcut("execution(* com.demo..*(..))")
	public void appPointcut() {
		
	}
	@Pointcut("appPointcut() && controllerPointcuts() ||servicePointcuts() "
			+ "||repositoryPointcuts()")
	public void mainPointCouts() {
		
	}

}
