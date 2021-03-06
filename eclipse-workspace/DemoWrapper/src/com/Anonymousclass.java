package com;

//in this we will use anonymous class this anonymous class 
// do not have any name and it starts with declaration of 
// the method only it can be done if there is one method already 
// present in one "abstract" class or "interface"

/* naming of .class file for anonymous class:-
 * {Mainclassname}${any random class name is taken for anonymous class}.class
 * */

abstract class Person {
	void eat() {}

}
public class Anonymousclass{
	public static void main(String args[]) {
		
		// Person p = new Person();   // we cannot instantiate like this 
		
		// so we will use it as anonymous class
		
		Person p = new Person() {     //we have started one another class without name
			                          // so this is the anonymous class
			void eat() {
				System.out.println("Eating fruits");
			}
		};    //This anonymous class needs semicolon at end 
		
		
		p.eat();
		//making call
		
	}
}