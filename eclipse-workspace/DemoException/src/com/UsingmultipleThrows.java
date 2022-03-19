package com;
import java.io.*;

//we can also use "throws" instead of try and catch block and
//following throws we can write name of exceptions
public class UsingmultipleThrows {
	public static void findFile() throws IOException,NullPointerException,
	       InvalidClassException, ArrayIndexOutOfBoundsException{
		//code that may produce IOException
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
		
		//code that may produce NullPointerException
		
		//code that may produce InvalidClassException
		
		//code that may produce ArrayIndexOutOfBoundsException
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can use multiple catch blocks
		
		try {
			findFile();
			
		}catch(IOException e) {
			System.out.println(e);
			
		}catch(NullPointerException e) {
			///some message
			
		}catch(Exception e) {
			
		}

	}

}