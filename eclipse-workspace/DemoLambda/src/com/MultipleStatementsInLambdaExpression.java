package com;

@FunctionalInterface
interface Sayable1{
	String say(String message);
}

public class MultipleStatementsInLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//You can pass multiple statements in lambda expression
		Sayable1 person =(message)->{
			String str1 = "I would like to say";
			String str2 = str1 + message;9
			return str2;
		};
		System.out.println(person.say(" time is precious"));
		
		
		//You can pass multiple statements in lamda expression
				Sayable1 person2 =(String message)->{
					String str1 = "I would like to say";
					String str2 = str1 + message;
					return str2;
				};
				System.out.println(person2.say(" time is precious22"));
				

	}

}
