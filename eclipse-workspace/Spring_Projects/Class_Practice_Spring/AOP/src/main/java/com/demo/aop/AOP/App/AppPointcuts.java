package com.demo.aop.AOP.App;

import org.aspectj.lang.annotation.Pointcut;

public class AppPointcuts {
	
	
	@Pointcut("within(@org.springframework.stereotype.Respository *)")
	public void servicePointcuts() {
		
	}

}
