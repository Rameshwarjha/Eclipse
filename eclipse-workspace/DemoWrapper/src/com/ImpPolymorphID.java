package com;

import java.util.Scanner;

public class ImpPolymorphID {
	private final String name = "Rameshwar jha";
    private final Integer cvv = 000;
	
	class Validatepayment{
		void validate(String custname ,Integer custcvv) {
			if(custname.equals(name)&& custcvv.equals(cvv)) {
				System.out.println("valid customer");
			}
			else {
				System.out.println("Invalid details Entered");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = scn.nextLine();
		System.out.println("Enter cvv");

		int cvv = scn.nextInt();
		
		Integer cvvobj = cvv;   // making primitive int to integer class
		
		ImpPolymorphID obj = new ImpPolymorphID();
		ImpPolymorphID.Validatepayment payment = obj.new Validatepayment();

		payment.validate(name, cvvobj);
	}

}
