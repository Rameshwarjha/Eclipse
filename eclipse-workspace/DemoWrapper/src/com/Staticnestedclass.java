package com;

// in static nested class the class nested is static 
// in this the static class inside can access only the 
//  can access static data type only from static nested class
// static nested class cannot access non static data members


public class Staticnestedclass {
	
	static int data =30;
	static class Inner{
		void msg() { 
			// we can access data as that is 
			// static data member of outer class 
			System.out.println("data is"+data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// method to create object of inner static class object
		// and to call it
		
		Staticnestedclass.Inner obj = new Staticnestedclass.Inner();
		obj.msg();

	}

}
