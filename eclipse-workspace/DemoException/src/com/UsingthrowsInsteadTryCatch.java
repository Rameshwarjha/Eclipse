package com;
import java.io.*;

//we can also use "throws" instead of try and catch block and
//following throws we can write name of exceptions
public class UsingthrowsInsteadTryCatch {
	public static void findFile() throws IOException{
		//code that may produce IOException
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			findFile();
			
		}catch(IOException e) {
			System.out.println(e);
			
		}

	}

}
