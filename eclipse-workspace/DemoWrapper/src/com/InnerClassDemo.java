package com;

public class InnerClassDemo {
	private int data =30;
	class Inner{
		void message() {System.out.println("data is"+data);
		
		}
		
	}
	public static void main(String args[]) {
		InnerClassDemo obj = new InnerClassDemo();
		
		InnerClassDemo.Inner In = obj.new Inner();
		
		In.message();
		
		
	}

}
