package com.demo.aop.AOP.App;

import com.fasterxml.jackson.databind.ObjectMapper;

//import full lombok which is used to reduce the code 
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter


public class LoggerMessage {
	private String className;
	private String methodName;
	private String methodArgs;
	private Long elapsedTimeInMillis;
	private Long elapsedTimeInMicros;
	private Object result;
	
	//used "@SneakyThrows" in order to throw the error - it is used 
	// for this purpose to throw error (from Lombok)
	
	@SneakyThrows
	@Override
	public String toString() {
		return "LoggerMessage [className=" + className + ", methodName=" + methodName + ", methodArgs=" + methodArgs
				+ ", elapsedTimeInMillis=" + elapsedTimeInMillis + ", elapsedTimeInMicros=" + elapsedTimeInMicros
				+ ", result=" + result + new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this.result) + "]";
	}
	
	

}
