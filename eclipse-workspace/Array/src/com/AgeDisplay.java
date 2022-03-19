package com;
import java.util.*;
public class AgeDisplay {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		int arr[]= new int[11];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the age of "+(i+1)+" player");
			arr[i]=scn.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("The age of "+(i+1)+" player is "+arr[i]);
			
		}
		scn.close();
	}
	

}
