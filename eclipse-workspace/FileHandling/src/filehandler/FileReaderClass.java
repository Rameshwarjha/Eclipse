package filehandler;
import java.io.*;
/***this method do not needs to change or convert from bytes 
 * it directly does everything
 * @author asus
 *
 */

public class FileReaderClass {
	
	public static void main(String args[]) {
		try {
			
		FileReader fr = new FileReader("E://new//createFileUsingCode.txt");
		
		int
		System.out.println((char)fr.read(null));
		
		fr.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
