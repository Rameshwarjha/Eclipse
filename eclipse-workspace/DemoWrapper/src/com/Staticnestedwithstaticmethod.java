package com;

public class Staticnestedwithstaticmethod {
	static int data =30;
	
	static class Inner{
		// this time we are creating static method
		
		static void msg() {
			System.out.println("data is"+data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if inner class is static and
		// method of inner class is also static then 
		// we can directly call it 
		// there is no need to instantiate
		
		Staticnestedwithstaticmethod.Inner.msg(); // no need to instantiate the object of class 
		                                          // as it is static method inside static inner class
		
	}

}
