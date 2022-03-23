/*** Warning ** This Program contains awesome content from javaTpoint ***/

//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface 
package com;

import java.util.*;  
import java.io.*;  
	class Student implements Comparable<Student>{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	
	//we have used comparaTo method in comparable Interface
	//this compareTo tells the "Collections.sort" method that 
	//*** " On which Basis the data will be sorted" ***
	public int compareTo(Student st){  
		if(age==st.age)  
			return 0;  
		else if(age>st.age)  
			return 1;  
		else  
			return -1;  
	}  
}  
//Creating a test class to sort the elements  
public class ComparableDemo{  
public static void main(String args[]){  
	
	// we are making an arraylist of type class Student that we have defined
	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(103,"Raj",23));
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
	  
	Collections.sort(al);  
	
	//iterating using "for loop"
	System.out.println("iterating using \"for loop\" ");
	for(int i=0; i<al.size();i++) {
		
		System.out.println(al.get(i).rollno +" " + al.get(i).name + " " + al.get(i).age+" ");
	}
	System.out.println();
	
	//iterating using "for-each" loop
	System.out.println("iterating using \"for-each\" loop ");
	for(Student st:al){  
			
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
}  
}  
