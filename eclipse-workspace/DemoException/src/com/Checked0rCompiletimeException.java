package com;
import java.io.*;


public class Checked0rCompiletimeException {
	
	//checked exception means compile time exceptions
	//this type of exception we get during compile time before running the program
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this piece of code throws file not found exception
		FileInputStream input1 = null;
		
		//for exception handling there could be "try" and "catch" blocks 
		//for this there could be multiple "catch" block for one "try" block 
		//catch block is used to catch exception and print that 
		// this "insures that code runs without stopping abruptly and rest of the program runs without any problem
		
		// at last there we have also an option to keep finally block and code to run finally instead of the try block code
		
		try {
			input1 = new FileInputStream("C://Users//asus//RjDocs//data.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch(Exception e ) {
			e.printStackTrace();
		} finally {
			System.out.println("code from finally block");
			
		}
		System.out.println();
		System.out.println("Rest code is working fine");
		
	}

}
