package com;
import java.util.*;


public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(100, "Amit");
		map.put(102,"Ravi");
		map.put(101, "vijay");
		map.put(194, "Rahul");
		
		//This is special type for iterating with for each loop 
		
		//
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
