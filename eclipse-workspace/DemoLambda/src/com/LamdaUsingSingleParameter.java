package com;

interface Sayable{
	public String say(String name);
}

public class LamdaUsingSingleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda expression with single parameter
		Sayable s1=(name)->{
			return "Hello, " + name;
		};
		System.out.println(s1.say("sonoo"));
		
		//You can omit function parentheses
		Sayable s2= name ->{
			return "Hello, " + name;
			
		};
		
		System.out.println(s2.say("saynooo"));

	}

}
