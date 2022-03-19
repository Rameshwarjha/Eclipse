package com;

public class localInner2 {
	private int data = 30; // instance variable
	void display(){
		int value =50;   // local variable must be final till jdk1.7 only
		
		class local{
			void msg() {System.out.println(value);}
		}
		local l = new local();
		l.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// here we are making object of outerclass only as 
		// we have already made object and made a call in 
		// local class while making local class
		localInner2 obj =new localInner2();
		obj.display();

	}

}
