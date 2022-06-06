package com.demo.Aop;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.extern.slf4j.Slf4j;

@Order(0)
@Aspect
@Configuration

public class LogAspect {

	@Around(value="com.demo.Aop.AppPointcuts.mainPointCouts()")
	public Object calculateMethodAdviceTime(ProceedingJoinPoint joinPoint) throws Throwable {
		//secondary logic
		
		final Logger classLogger= LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		
		if(!classLogger.isDebugEnabled()) {
			return joinPoint.proceed();
		}
		
		String ClassName=joinPoint.getTarget().getClass().getName();
		String methodName=((MethodSignature)joinPoint.getSignature()).getMethod().getName();
		String methodArgs=Stream.of(joinPoint.getArgs()).collect(Collectors.toList()).toString();
		long startTime=System.nanoTime();
		Object result=joinPoint.proceed();
		long endTime=System.nanoTime();
		long elapsedTime=endTime-startTime;
		
		LoggerMessage message=LoggerMessage
				.builder()
				.className(ClassName)
				.methodName(methodName)
				.methodArgs(methodArgs)
				.elapsedTimeInMillis(TimeUnit.NANOSECONDS.toMillis(elapsedTime))
				.elapsedTimeInMicros(TimeUnit.NANOSECONDS.toMicros(elapsedTime))
				.result(result)
				.build();
		
		classLogger.debug("LogAspect:{}",message);
		return result;
		
	}
}
