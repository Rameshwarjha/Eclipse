package filehandler;

import java.io.File;

import java.io.IOException;

public class CreateFile {
	
	public static void main(String args[]) {
		try {
			
			// always use forward slash in path name double forward slash after each 
			//convention --> "Path name + //nameOfFileToBeCreated.txt"
			File f0 = new File("E://new//createFileUsingCode.txt");
			
			if(f0.createNewFile()) {
				System.out.println("File "+f0.getName()+ " is created");
				
			}else {
				System.out.println("File already Exists in folder");
				
			}
			
		}catch(IOException e ) {
			
			System.out.println("An unexpected error occured");
			e.printStackTrace();
		}
		
	}
	

}
