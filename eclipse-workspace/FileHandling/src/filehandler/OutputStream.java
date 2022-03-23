package filehandler;

import java.io.FileOutputStream;

/*****This method overwrite the existing things and all new stuff
 * are written there 
 * all oolder stuff gets deleted
 * @author asus
 * 
 * 
 *
 *
 */

public class OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			/***this method deletes previous stuff and writes new in place***/
			//FileOutputStream fo= new FileOutputStream("E://new//createFileUsingCode.txt");
			
						/******Important******/
			/***this method retains previous stuff and writes new stuff after that***/
			FileOutputStream fo= new FileOutputStream("E://new//createFileUsingCode.txt",true);
			
		String s ="Its all about javaworld";
		
		byte b[] =s.getBytes();
		fo.write(b);
		System.out.println("success");
		fo.close();
		
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}

}
