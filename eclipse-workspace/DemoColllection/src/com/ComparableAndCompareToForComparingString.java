/*** Warning ** This Program contains awesome content from javaTpoint ***/
/*** comparable showing compareTo method for sorting according to string values
 * 
 */

/*** PreRequisite to know
 * #####Comparing of String###
 * class Teststringcomparison4{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
   System.out.println(s1.compareTo(s2));//0    returns 0 for equal values
   System.out.println(s1.compareTo(s3));//1(because s1>s3)    returns 1 if v1>v2
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  returns -1 if v1<v2
 }  
}  
 */

//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface 
package com;

import java.util.*;  
import java.io.*;  
	class Student1 implements Comparable<Student1>{  
	int rollno;  
	String name;  
	int age;  
	Student1(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	
	//we have used comparaTo method in comparable Interface
	//this compareTo tells the "Collections.sort" method that 
	//*** " On which Basis the data will be sorted" ***
	public int compareTo(Student1 st){  
		//method to compare string values
		return name.compareTo(st.name);    // returns 0 if equal, 1 if greater, -1 if smaller
		
		// returns 0 if equal, 1 if value is greater, -1 if value is smaller
	}  
}  
//Creating a test class to sort the elements  
public class ComparableAndCompareToForComparingString{  
public static void main(String args[]){  
	
	// we are making an arraylist of type class Student1 that we have defined
	ArrayList<Student1> al=new ArrayList<Student1>();  
	al.add(new Student1(101,"Vijay",23));  
	al.add(new Student1(103,"Raj",23));
	al.add(new Student1(106,"Ajay",27));  
	al.add(new Student1(105,"Jai",21));  
	  
	Collections.sort(al);  
	
	//iterating using "for loop"
	System.out.println("iterating using \"for loop\" ");
	for(int i=0; i<al.size();i++) {
		
		System.out.println(al.get(i).rollno +" " + al.get(i).name + " " + al.get(i).age+" ");
	}
	System.out.println();
	
	//iterating using "for-each" loop
	System.out.println("iterating using \"for-each\" loop ");
	for(Student1 st:al){  
			
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
}  
}  
