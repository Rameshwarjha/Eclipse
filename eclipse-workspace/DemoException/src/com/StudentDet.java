package com;

import java.util.*;

public class StudentDet {
	
	public static void checkDetails(String name , String Class, int rollno) {
		
		// as this is critical code so we will wrap into try and catch block
		
		try {
		if(name.startsWith("A")||name.startsWith("a")) {
			System.out.println("name = "+name + "class = "+Class + "roll no ="+rollno);
		}else {
			System.out.println("Record not found");
			
		}
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			System.out.println("give right input");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter name");
		String n1 = scn.next();
		
		System.out.println("Enter class");
		String c1 = scn.next();
		
		System.out.println("Enter roll no");
		int r1 = scn.nextInt();
		
		scn.close();
		
		checkDetails(n1,c1,r1);
		
		
		
		

	}

}
