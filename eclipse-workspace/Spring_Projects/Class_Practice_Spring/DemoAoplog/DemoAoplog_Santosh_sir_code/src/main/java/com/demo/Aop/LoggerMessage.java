package com.demo.Aop;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	@SneakyThrows
	@Override
	public String toString() {
		return "LoggerMessage [className=" + className + ", methodName=" + methodName + ","
				+ " methodArgs=" + methodArgs
				+ ", elapsedTimeInMillis=" + elapsedTimeInMillis + ","
						+ " elapsedTimeInMicros=" + elapsedTimeInMicros
				+ ", result=" + new ObjectMapper().writerWithDefaultPrettyPrinter()
				.writeValueAsString(this.result) + "]";
	}


	
	

}
