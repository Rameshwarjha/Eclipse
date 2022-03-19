package com;

public class Factorial {
	
	public static int factorial(int num) {
	    if(num==1) {
	    	return 1;
	    	
	    }else {
		return num*factorial(num-1);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("Factorial of 5 is : "+ factorial(5));

	}

}
