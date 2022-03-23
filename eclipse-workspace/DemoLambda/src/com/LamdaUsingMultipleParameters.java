package com;

interface Adorable{
	public int addable(int n1,int n2);
}

public class LamdaUsingMultipleParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda with multiple parameters
		Adorable ad1=(a,b)->(a+b);
		System.out.println(ad1.addable(100, 200));
		
		//other type but of same above lambda expression 
		// but it does not saves lines
		Adorable ad2=(a,b)->{
			int c;
			c=a+b;
			return c;
			
		};
		System.out.println(ad2.addable(30, 50));
		
		//multiple parameters with data types in lambda expression
		Adorable ad3 =(int a ,int b)->(a+b);
		System.out.println(ad3.addable(50, 40));
		
		
		//without return type .
		
		
		

	}

}
