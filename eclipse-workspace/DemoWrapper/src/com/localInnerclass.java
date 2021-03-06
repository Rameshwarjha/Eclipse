package com;

/* Rules for local inner class
 * Rule 1 - local inner class cannot be invoked from outside the method
 * Rule 2- local inner class cannot access non-final local variable till jdk1.7 since jdk 1.8 ,
 * it is possible to access the non-final loccal variable in the local iner class
 *  */

//local Inner class is a class which is a class that is 
// declared inside the method of another class 
// it is not declared directly inside other class also not 
// not outside of other class

public class localInnerclass {
	private int data =30;  // instance variable
	void display() {
		
		// here we are declaring "class inside a method 
		// it is called local class"
		
		class local{
			void msg() {
				System.out.println(data);
			}
		}   // no semicolon needed at end of local class
		
		local l = new local();
		l.msg();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		localInnerclass obj = new localInnerclass();
		obj.display();   //local inner class and its methods 
		                 // can be called directly
		
		

	}

}
