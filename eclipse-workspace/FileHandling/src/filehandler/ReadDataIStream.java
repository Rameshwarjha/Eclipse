package filehandler;

//method to read input from file

import java.io.*;

public class ReadDataIStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fi =new FileInputStream("E://new//createFileUsingCode.txt");
			int i = 0;
			
  //WE ARE INITIALIZING INSIDE WHILE LOOP AS WE WANT NEW VALUE OF "i" EACH TIME 
//LOOP GETS EXECUTED
			while ((i=fi.read())!=-1) {
				System.out.print((char)i);
				
			}
			fi.close();
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
	
	      /******WRONG METHOD******/
	      /****AS FI.READ() NEEDS TO BE EXECUTED EACH TIME IN THE WHILE LOOP****/
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fi =new FileInputStream("E://new//createFileUsingCode.txt");
			int i = fi.read();
			
			while (i!=-1) {
				System.out.print((char)i);
				
			}
			fi.close();
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		
	}*/

}
